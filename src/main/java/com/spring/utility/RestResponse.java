package com.spring.utility;

import java.util.Date;

public class RestResponse {
	
	 private String errorMessage;

	  private Boolean status;
	  
	  private String data;
	  
	  private Date date;
	  
	  

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	

	public RestResponse(String errorMessage, Boolean status, String data, Date date) {
		super();
		this.errorMessage = errorMessage;
		this.status = status;
		this.data = data;
		this.date = date;
	}

	public RestResponse() {}
	  
	  


}
