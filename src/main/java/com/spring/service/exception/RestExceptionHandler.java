package com.spring.service.exception;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.spring.utility.RestResponse;



@ControllerAdvice
public class RestExceptionHandler extends  ResponseEntityExceptionHandler{
	public static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

	public static final String DEFAULT_MESSAGE = "Opps this is embarrassing 😳";

	private static Logger log = Logger.getLogger(RestExceptionHandler.class);
	
	@ExceptionHandler(value = {Exception.class})
	  protected ResponseEntity<RestResponse> handleUnknownException(Exception ex, WebRequest request) {
		log.error(ex.getMessage(), ex);
		RestResponse restResponse= new RestResponse(DEFAULT_MESSAGE,false,"",new Date());
	    return new ResponseEntity<RestResponse>(restResponse, DEFAULT_HTTP_STATUS);
	  }

	  @ExceptionHandler(value = {UserNotFoundException.class})
	  protected ResponseEntity<RestResponse> handleHunterException(UserNotFoundException ex, WebRequest request) {
		  log.error(ex.getMessage(), ex);
			RestResponse restResponse= new RestResponse(DEFAULT_MESSAGE,false,"",new Date());
		    return new ResponseEntity<RestResponse>(restResponse, DEFAULT_HTTP_STATUS);
	  }
}
