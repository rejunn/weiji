package models.mappers;

import models.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	/**
	 * 根据ID查询身份证号
	 *
	 * @Title: selectById 
	 * @param id
	 * @return
	 * @return: User
	 */
	 @Select("select u.* from user u where u.idcard=#{id}")
	    User selectById(String id);
	 /**
	  * 根据身份证号获取用户
	  *
	  * @Title: selectidcardById 
	  * @param id
	  * @return
	  * @return: String
	  */
	 @Select("select u.identify from user u where u.id=#{id}")
	    String selectidcardById(String id);
	 /**
	  * 插入新用户
	  *
	  * @Title: insert 
	  * @param user
	  * @return: void
	  */
	 @Insert("insert into "
			+ User.TABLE_NAME
			+ "(idcard,password,name,sex,phone,birthdate,address,salt,createtime,createway) "
			+ "values(#{idcard},#{password},#{name},#{sex},#{phone},#{birthdate},#{address},#{salt},#{createtime},#{createway})")
	 void insert(User user);
	 /**
	  * 更新用户信息
	  *
	  * @Title: update 
	  * @param user
	  * @return: void
	  */
	 @Update("update "
	 		+ User.TABLE_NAME
	 		+"set name=#{name},phone=#{phone},birthdate=#{birthdate},address=#{address},modifytime=#{modifytime} where idcard=#{idcard}")
	 void update(User user);
}
