package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import models.ResultVo;
import models.ReturnCode;
import models.User;

import com.alibaba.fastjson.JSON;
import play.mvc.Controller;

public class BaseController extends Controller {
	private static final Logger log = LoggerFactory.getLogger(BaseController.class);
	public final static String FIELD_USER="user_id";
	public final static String FIELD_ADMIN="admin_id";
	
	/**
	 * 返回数据
	 *
	 * @Title: renderFailedJson 
	 * @param code 状态代码
	 * @param msg 状态值
	 * @return: void
	 */
	protected static void renderFailedJson(int code, String msg) {
		renderJSON(JSON.toJSONString(new ResultVo(code, msg)));
	}
	/**
	 * 对返回数据进行包装，格式为：{"code":输入的code,"msg":""}
	 */
	protected static void renderFailedJson(int code) {
		renderJSON(JSON.toJSONString(new ResultVo(code)));
	}
	/**
	 * 
	 * 获取当前会话中的用户.
	 * 
	 * @return
	 * @since v0.1
	 */
	public static User getCurrentUser() {
		// Secure校验通过后，已设置用户数据
	    if (renderArgs.get(FIELD_USER) == null&&renderArgs.get(FIELD_ADMIN)==null) {
            log.error("user INVALID_SESSION ");
            handleIllegalRequest(ReturnCode.INVALID_SESSION);
        }
		return (User) renderArgs.get(FIELD_USER);
	}
	/**
	 * 
	 * 处理非法请求：未认证、会话过期等
	 * 
	 * @param failedReturnCode 针对Ajax请求返回的错误码
	 * @since v0.1
	 */
    protected static void handleIllegalRequest(int failedReturnCode) {

		// 针对Ajax请求返回特定格式的消息
		if (request.isAjax()) {
			renderFailedJson(failedReturnCode);
		}
		// 转向登录页
		redirect("/login");
	}
}
