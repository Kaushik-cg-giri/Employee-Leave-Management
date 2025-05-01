package com.practise.employee.attendence.model;

import java.time.LocalDateTime;

public class CheckOutResponse {

	private String message;
	private String employeeId;
	private LocalDateTime checkOutTime;
	private String status;
	public CheckOutResponse() {
		super();
	}
	public CheckOutResponse(String message, String employeeId, LocalDateTime checkOutTime, String status) {
		super();
		this.message = message;
		this.employeeId = employeeId;
		this.checkOutTime = checkOutTime;
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
	public LocalDateTime getcheckOutTime() {
		return checkOutTime;
	}
	public void setcheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
