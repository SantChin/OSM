package com.san.osm.exception;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	private int errorCode = 500;
	private String errormessage;

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(int errorCode, String errormessage) {
		super();
		this.errorCode = errorCode;
		this.errormessage = errormessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

}
