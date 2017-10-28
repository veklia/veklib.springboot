package com.veklib.springboot.bean;

import java.util.Map;

public class RequestResult {
	private int status;
	private int result = 1;//default 1 | false
	private Map<String,Object> params;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", result=" + result + ", params=" + params + "]";
	}

}
