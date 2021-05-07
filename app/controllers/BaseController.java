package controllers;

import models.ResultVo;

import com.alibaba.fastjson.JSON;

import play.mvc.Controller;

public class BaseController extends Controller {
	protected static void renderFailedJson(int code, String msg) {
		renderJSON(JSON.toJSONString(new ResultVo(code, msg)));
	}
}
