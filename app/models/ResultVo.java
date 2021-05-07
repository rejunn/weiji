package models;

import com.alibaba.fastjson.JSON;

public class ResultVo {
	 public ResultVo()
	    {
	        msg = "";
	    }

	    public ResultVo(int code)
	    {
	        msg = "";
	        this.code = code;
	    }

	    public ResultVo(int code, String msg)
	    {
	        this.msg = "";
	        this.code = code;
	        this.msg = msg;
	    }

	    public ResultVo(int code, String msg, Object result)
	    {
	        this.msg = "";
	        this.code = code;
	        this.msg = msg;
	        results = result;
	    }

	    public ResultVo(Object result)
	    {
	        msg = "";
	        code = 200;
	        results = result;
	    }

	    public String toJson()
	    {
	        return JSON.toJSONString(this);
	    }

	    public int code;
	    public String msg;
	    public Object results;
}
