package services;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.libs.Codec;
import utils.BizConstants;
import utils.UUIDString;

import com.aton.db.SessionFactory;

import models.User;
import models.WebHraDetail;
import models.mappers.UserMapper;
import models.mappers.WebHraDetailMapper;

public class WebHraDetailService{
	private static final Logger log = LoggerFactory.getLogger(User.class);
	/**
	 * 保存webHRA数据
	 *
	 * @Title: insertHRAData 
	 * @param webHra HRA设备检测数据
	 * @return: void
	 */
	public static void insertHRAData(WebHraDetail webHra){
		Date date=new Date();
		webHra.createtime=date;
		SqlSession ss = SessionFactory.getSqlSessionWithoutAutoCommit();
		try{
			WebHraDetailMapper mapper = ss.getMapper(WebHraDetailMapper.class);
			webHra.did=UUIDString.create();
			mapper.insert(webHra);
			ss.commit();
		}catch(Exception e){
			e.printStackTrace();
			log.warn("体检数据保存失败 id为"+webHra.idcard);
		}
		finally {
            ss.close();
        }
	}
}
