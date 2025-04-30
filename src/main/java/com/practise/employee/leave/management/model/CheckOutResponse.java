package com.practise.employee.leave.management.model;

import java.time.LocalDateTime;

public class CheckOutResponse {

	private String message;
	private String employeeId;
	private LocalDateTime checkInTime;
	private String status;
	public CheckOutResponse() {
		super();
	}
	public CheckOutResponse(String message, String employeeId, LocalDateTime checkInTime, String status) {
		super();
		this.message = message;
		this.employeeId = employeeId;
		this.checkInTime = checkInTime;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
