package com.san.osm.exception;

import org.springframework.http.HttpStatus;

public class DataNotFoundException extends CustomException {

	private static final long serialVersionUID = 1L;

	public DataNotFoundException() {
		super();
		setErrormessage("Data Not Found.");
		setErrorCode(HttpStatus.NOT_FOUND.value());
	}

	public DataNotFoundException(int errorCode, String errormessage) {
		super(errorCode, errormessage);
		setErrormessage(errormessage);
		setErrorCode(errorCode);
	}

}
