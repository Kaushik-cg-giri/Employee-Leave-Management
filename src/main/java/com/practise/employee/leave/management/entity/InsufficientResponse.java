package com.practise.employee.leave.management.entity;

import org.springframework.stereotype.Component;

@Component
public class InsufficientResponse implements Response {
	
	private String status;
	private String message;
	public InsufficientResponse() {
		super();
	}
	public InsufficientResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
