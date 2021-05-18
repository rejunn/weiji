package models;

import java.util.Date;

import javax.persistence.Id;

import models.mappers.UserMapper;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aton.db.SessionFactory;

import controllers.HeathDataController;
import play.data.validation.Required;
import play.db.jpa.GenericModel;
import play.libs.Codec;
import play.mvc.Scope.Session;
import utils.BizConstants;

/** 
 * 用户实体类
 * @ClassName: User 
 * @author: wangsm
 * @date: 2016年3月22日 下午1:47:17  
 */
public class User implements java.io.Serializable {
	private static final Logger log = LoggerFactory.getLogger(User.class);
	public static final String TABLE_NAME="user";
		@Id
		public String idcard;
		public String password;
		public Date birthdate;
		public String name;
		public String sex;
		public String phone;
		public String nation;
		public String address;
		public String work;
		public double workperiod;
		public String workstart;
		public String workend;
		public String workway;
		public String workdesc;
		public String salt;
		public Date createtime;
		public Date modifytime;
		public String createway;
		public User(){
			
		}
	
		public User(String userid, String idcard, String password,
				Date birthdate, String name, String sex, String phone,
				String nation, String address, String work, double workperiod,
				String workstart, String workend, String workway,
				String workdesc, String salt, Date createtime, Date modifytime,String createway) {
			super();
			this.idcard = idcard;
			this.password = password;
			this.birthdate = birthdate;
			this.name = name;
			this.sex = sex;
			this.phone = phone;
			this.nation = nation;
			this.address = address;
			this.work = work;
			this.workperiod = workperiod;
			this.workstart = workstart;
			this.workend = workend;
			this.workway = workway;
			this.workdesc = workdesc;
			this.salt = salt;
			this.createtime = createtime;
			this.modifytime = modifytime;
			this.createway=createway;
		}
		

		public Date getCreateTime() {
			return createtime;
		}

		public void setCrateTime(Date cratetime) {
			this.createtime = cratetime;
		}

		/**
	     * 
	     * 根据ID查询数据.
	     *
	     * @param id
	     * @return
	     * @since  0.1
	     * @author youblade
	     * @created 2014年7月16日 下午5:44:45
	     */
	    public static User findById(String id) {
	        SqlSession ss = SessionFactory.getSqlSession();
	        try {
	            UserMapper mapper = ss.getMapper(UserMapper.class);
	            return mapper.selectById(id);
	        } finally {
	            ss.close();
	        }
	    }
	    /**
	     * 根据用户ID查询身份证号
	     */
	    public static String findIdcardById(String id) {
	        SqlSession ss = SessionFactory.getSqlSession();
	        try {
	            UserMapper mapper = ss.getMapper(UserMapper.class);
	            return mapper.selectidcardById(id);
	        } finally {
	            ss.close();
	        }
	    }
	    /**
	     * 创建用户
	     *
	     * @Title: create 
	     * @return: void
	     */
		public void create() {
			// TODO Auto-generated method stub
			
			SqlSession ss = SessionFactory.getSqlSessionWithoutAutoCommit();
			try{
				UserMapper mapper = ss.getMapper(UserMapper.class);
				//用户密码为空时，初始化用户密码
				if(StringUtils.isEmpty(this.password)){
					this.password=BizConstants.USER_PASS_INIT;
				}
				//用户密码加盐后进行MD5加密
				this.salt=String.valueOf(Math.random()).substring(2, 10);
				this.password=Codec.hexMD5(this.password+this.salt);
				Date date=new Date();
				this.createtime=date;
				mapper.insert(this);
				ss.commit();
			}catch(Exception e){
				e.printStackTrace();
				log.warn("用户保存失败 id为"+this.idcard+":"+this.name);
			}
			finally {
	            ss.close();
	        }
			
		}
		/**
		 * 更新用户信息
		 *
		 * @Title: update 
		 * @return: void
		 */
		public void update() {
			// TODO Auto-generated method stub
			SqlSession ss = SessionFactory.getSqlSessionWithoutAutoCommit();
			try{
				UserMapper mapper = ss.getMapper(UserMapper.class);
				Date date=new Date();
				this.modifytime=date;
				mapper.update(this);
			}catch(Exception e){
				e.printStackTrace();
				log.warn("用户更新失败 id为"+this.idcard+":"+this.name);
			}
			finally {
	            ss.close();
	        }	
		}
}
