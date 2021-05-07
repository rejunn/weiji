package controllers;

import java.io.File;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class Test {
	public static void main(String[] args) {
		String json="{huiyuanziliao_xingming:xxxx,huiyuanziliao_zhiye:xxxx,"+
    "huiyuanziliao_tizhong:xxxx,huiyuanziliao_phone:xxxx,huiyuanziliao_number:xxxx,"+
    "huiyuanziliao_xingbie:xxxx,huiyuanziliao_jianchariqi:xxxx,huiyuanziliao_jianchashijian:xxxx,"+
    "huiyuanziliao_yaowei:xxxx,huiyuanziliao_songjianyishi:xxxx,huiyuanziliao_nianling:xxxx,"+
    "huiyuanziliao_chushengriqi:xxxx,huiyuanziliao_shengao:xxxx}";
		Perase(json);
	}
	public static void Perase(String detail){
		JSONObject json=JSONObject.parseObject(detail);
		for (Map.Entry<String, Object> entry : json.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}
}
