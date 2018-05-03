package com.kq.springboot.dto;


public class DtoResult{

	private String code = "000000";
	
	private Object result;
	
	public DtoResult(){
	}
	
	public DtoResult(String code, Object result) {
		super();
		this.code = code;
		this.result = result;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		
		this.result = result;
	}
}
