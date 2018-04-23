package com.blomni.o2o.restaurant.exception;



public class RestaurantServiceException extends Exception {
	private static final long serialVersionUID = 1L;
	private String code;
	private String msg;
	private String shortCode;

	public RestaurantServiceException() {
	}

	public RestaurantServiceException(String code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
		if(null != code && !code.equals("") && code.length() >4){
			this.shortCode = code.substring(code.length()-4);
		}
	}
	
	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public RestaurantServiceException(String code){
		super(code,null);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
