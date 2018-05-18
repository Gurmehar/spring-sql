package com.spring.service.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE="user not found";
	private static final HttpStatus DEFAULT_STATUS = HttpStatus.BAD_REQUEST;
	
	public UserNotFoundException(String DEFAULT_MESSAGE) {
		this(DEFAULT_MESSAGE,DEFAULT_STATUS);
	}
	
	
	public UserNotFoundException(HttpStatus httpStatus) {
		this(DEFAULT_MESSAGE,httpStatus);
	}


	public UserNotFoundException(String defaultMessage, HttpStatus httpStatus) {
		super(defaultMessage);
	}
	
	public UserNotFoundException(){
		this(DEFAULT_MESSAGE,DEFAULT_STATUS);
	}

}
