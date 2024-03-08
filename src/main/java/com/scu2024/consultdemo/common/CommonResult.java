package com.scu2024.consultdemo.common;

import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import org.springframework.jdbc.core.metadata.OracleCallMetaDataProvider;

import java.net.http.WebSocket;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 13:59
 **/
public class CommonResult {
	private int code;
	private String msg;
	private Object data;
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public static CommonResult bizError(String msg){
		CommonResult commonResult = new CommonResult();
		commonResult.setCode(501);
		commonResult.setStatus(false);
		commonResult.setMsg(msg);
		return commonResult;
	}
	public static CommonResult success(){
		CommonResult commonResult = new CommonResult();
		commonResult.setCode(200);
		commonResult.setStatus(true);
		commonResult.setMsg("success");
		return commonResult;
	}

	public static CommonResult success(Object obj){
		CommonResult com = new CommonResult();
		com.setData(obj);
		com.setStatus(true);
		com.setCode(200);
		com.setMsg("success");
		return com;
	}

	public static CommonResult success(String msg){
		CommonResult com = new CommonResult();
		com.setMsg(msg);
		com.setCode(200);
		com.setStatus(true);
		return com;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
