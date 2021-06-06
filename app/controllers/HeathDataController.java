package controllers;

import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.ReturnCode;
import models.User;
import models.WebHraDetail;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.Play;
import play.data.validation.Required;
import play.libs.Codec;
import play.libs.Files;
import services.WebHraDetailService;
import utils.UUIDString;
import utils.BizConstants;
import utils.ValidatePassword;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aton.db.SessionFactory;

public class HeathDataController extends BaseController {
	private static final Logger log = LoggerFactory.getLogger(HeathDataController.class);
		/**
		 * HRA数据上传接口
		 *
		 * @Title: heathData 
		 * @param userinfo 用户信息
		 * @param detail 体检数据
		 * @param pdf 体检报告
		 * @return: void
		 */
		public static void heathData(String userinfo,String detail, File pdf){
			//String json=params.get("json");
			if(StringUtils.isEmpty(userinfo)){
				log.warn("上传数据为空值");
				renderFailedJson(ReturnCode.ErrorCode, "上传数据为空值");
			}
			//将字符串转换为实体类
			User newuser=new User();
			WebHraDetail webHra=new WebHraDetail();
			try{
				newuser=JSONObject.parseObject(userinfo, User.class);
				webHra=JSONObject.parseObject(detail, WebHraDetail.class);
				
			}catch(Exception e){
				log.warn("字符串解析失败");
				renderFailedJson(ReturnCode.ErrorCode, "字符串解析失败");
			}
			//判断用户身份证号是不是空，身份证格式是否正确
			if(StringUtils.isEmpty(newuser.idcard)){
				log.warn("身份证为空值");
				renderFailedJson(ReturnCode.ErrorCode, "身份证为空值");
			}
			Pattern idNumPattern = Pattern.compile("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])"); 
			Matcher idNumMatcher = idNumPattern.matcher(newuser.idcard);
			if(!idNumMatcher.matches()){
				log.warn("身份证格式不正确");
				renderFailedJson(ReturnCode.ErrorCode, "身份证格式不正确");
			}
			//验证用户是不是存在，不存在需要新注册
			User user=User.findById(newuser.idcard);
			if(user==null){
				log.warn(newuser.name+"的身份证号不存在需注册");
				boolean isDoRegist=doRegist(newuser);
				if(!isDoRegist){
					log.warn("新用户注册失败");
					renderFailedJson(ReturnCode.ErrorCode, "新用户注册失败");
				}
			}
			else{
//				if(!ValidatePassword.isPassword(newuser,user)){
//					renderFailedJson(ReturnCode.ErrorCode, "用户名或密码不正确");
//				}
				boolean isUpdate=doUpdate(newuser);
				if(!isUpdate){
					log.warn("用户信息更新失败");
					renderFailedJson(ReturnCode.ErrorCode, "用户信息更新失败");
				}
			}
			
			//保存附件，目录为/public/upload
			if(pdf==null){
				log.warn("体检报告为空");
				renderFailedJson(ReturnCode.ErrorCode, "体检报告为空");
			}
			String uuid=UUIDString.create();
//			String fileName = pdf.getName();
//			String fileExtName = fileName.substring(fileName.lastIndexOf('.')+1, fileName.length());
//			if(!"pdf".equalsIgnoreCase(fileExtName)){
//				log.warn("用户体检报告不是pdf格式");
//				renderFailedJson(ReturnCode.ErrorCode, "用户体检报告不是pdf格式");
//			}
			String filePath = "public/upload/"+newuser.idcard+"/" + uuid+".pdf";
			Files.copy(pdf, Play.getFile(filePath));
			//保存体检数据
			if(StringUtils.isEmpty(detail)){
				renderFailedJson(ReturnCode.ErrorCode, "用户体检报告为空");
			}
			boolean isReport=doSaveReport(webHra,newuser.idcard,uuid+".pdf");
			if(!isReport){
				log.warn("用户体检报告保存失败");
				renderFailedJson(ReturnCode.ErrorCode, "用户体检报告保存失败");
			}
			renderFailedJson(ReturnCode.SuccessCode, "保存成功");
		}
		/**
		 * 保存用户体检数据
		 *
		 * @Title: doSaveReport 
		 * @param filename	文件名称
		 * @param webHra HRA 体检数据
		 * @return
		 * @return: boolean
		 */
		private static boolean doSaveReport( WebHraDetail webHra,String userid,String filename) {
			// TODO Auto-generated method stub
			//设置pdf名称
			if(StringUtils.isNotEmpty(filename)){
				webHra.pdfname=filename;
			}
			//设置身份证号
			webHra.idcard=userid;
			try{
				WebHraDetailService.insertHRAData(webHra);
			}
			catch(Exception e){
				return false;
			}
			return true;
		}
		/**
		 * 更新用户
		 *
		 * @Title: doupdate 
		 * @param newuser 新用户
		 * @param user 现有用户
		 * @return: void
		 */
		private static boolean doUpdate(User newuser) {
			// TODO Auto-generated method stub
			if(StringUtils.isEmpty(newuser.idcard)){
				return false;
			}
			try{
				newuser.update();
			}
			catch(Exception e){
				return false;
			}
			//session.put(Variable.USER_SESSION_ID,newuser.idcard);
			return true;
		}
		/**
		 * 注册用户
		 *
		 * @Title: doregist 
		 * @param newuser 新用户
		 * @return: void
		 */
		
		private static boolean doRegist(User newuser) {
			// TODO Auto-generated method stub
			if(StringUtils.isEmpty(newuser.idcard)){
				return false;
			}
			//创建方式为：设备上传
			newuser.createway=BizConstants.USER_CREATEWAY_UPLOAD;
			try{
				newuser.create();
			}
			catch(Exception e){
				return false;
			}
			//session.put(Variable.USER_SESSION_ID,newuser.idcard);
			return true;
		}
		/**
		 * 测试--获取用户信息
		 *
		 * @Title: getUser 
		 * @return: void
		 */
		public static void getUser(String userid){
			User user=User.findById("130846273627");
			renderArgs.put("user", user);
			render();
		}
		/**
		 * 重置用户密码
		 *
		 * @Title: resetPassword 
		 * @param idCard 用户身份证号
		 * @return: void
		 */
		public static void resetPassword(String idCard){
			User user=getCurrentUser();
			if("admin".equals(user.name)){
				renderFailedJson(ReturnCode.ErrorCode, "登录用户非管理员用户");	
			}
			User reUser=User.findById(idCard);
			if(reUser==null){
				renderFailedJson(ReturnCode.ErrorCode, "用户不存在");	
			}
			try{
				reUser.resetPassword();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		/**
		 * 修改密码
		 *
		 * @Title: editPassword 
		 * @param idCard 身份证号
		 * @param newPassword 新密码
		 * @return: void
		 */
		public static void editPassword(String idCard,String newPassword){
			User user=getCurrentUser();
			if("admin".equals(user.name)){
				renderFailedJson(ReturnCode.ErrorCode, "登录用户非管理员用户");	
			}
			User reUser=User.findById(idCard);
			if(reUser==null){
				renderFailedJson(ReturnCode.ErrorCode, "用户不存在");	
			}
			try{
				reUser.password=newPassword;
				reUser.editPassword();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

}
