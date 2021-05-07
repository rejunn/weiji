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
import utils.Variable;

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
		public Date cratetime;
		public Date modifytime;
		public String createway;
		public User(){
			
		}
	
		public User(String userid, String idcard, String password,
				Date birthdate, String name, String sex, String phone,
				String nation, String address, String work, double workperiod,
				String workstart, String workend, String workway,
				String workdesc, String salt, Date cratetime, Date modifytime,String createway) {
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
			this.cratetime = cratetime;
			this.modifytime = modifytime;
			this.createway=createway;
		}
		public String getidcard() {
			return idcard;
		}

		public void setidcard(String idcard) {
			this.idcard = idcard;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getphone() {
			return phone;
		}

		public void setphone(String phone) {
			this.phone = phone;
		}

		public String getNation() {
			return nation;
		}

		public void setNation(String nation) {
			this.nation = nation;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getWork() {
			return work;
		}

		public void setWork(String work) {
			this.work = work;
		}

		public double getWorkperiod() {
			return workperiod;
		}

		public void setWorkperiod(double workperiod) {
			this.workperiod = workperiod;
		}

		public String getWorkstart() {
			return workstart;
		}

		public void setWorkstart(String workstart) {
			this.workstart = workstart;
		}

		public String getWorkend() {
			return workend;
		}

		public void setWorkend(String workend) {
			this.workend = workend;
		}

		public String getWorkway() {
			return workway;
		}

		public void setWorkway(String workway) {
			this.workway = workway;
		}

		public String getWorkdesc() {
			return workdesc;
		}

		public void setWorkdesc(String workdesc) {
			this.workdesc = workdesc;
		}

		public String getSalt() {
			return salt;
		}

		public void setSalt(String salt) {
			this.salt = salt;
		}

		public Date getCratetime() {
			return cratetime;
		}

		public void setCratetime(Date cratetime) {
			this.cratetime = cratetime;
		}

		public Date getModifytime() {
			return modifytime;
		}

		public void setModifytime(Date modifytime) {
			this.modifytime = modifytime;
		}

		public String getIdcard() {
			return idcard;
		}

		public void setIdcard(String idcard) {
			this.idcard = idcard;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCreateway() {
			return createway;
		}

		public void setCreateway(String createway) {
			this.createway = createway;
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
	    public static String getidcardById(String id) {
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
					this.password=Variable.USER_PASS_INIT;
				}
				//用户密码加盐后进行MD5加密
				this.salt=String.valueOf(Math.random()).substring(2, 10);
				this.password=Codec.hexMD5(this.password+this.salt);
				Date date=new Date();
				this.cratetime=date;
				mapper.insert(this);
				ss.commit();
			}catch(Exception e){
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
				log.warn("用户更新失败 id为"+this.idcard+":"+this.name);
			}
			finally {
	            ss.close();
	        }	
		}
}
