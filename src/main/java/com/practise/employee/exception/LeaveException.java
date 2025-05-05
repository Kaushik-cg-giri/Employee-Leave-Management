package com.practise.employee.exception;

public class LeaveException extends RuntimeException {

	private String message;

	
	public LeaveException(String message) {
		super();
		this.message = message;
	}
	
	
}
