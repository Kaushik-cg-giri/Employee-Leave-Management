package com.practise.employee.leave.management.model;

import java.time.LocalDateTime;

public class AttendenceResponse {

	private LocalDateTime date;
	private LocalDateTime checkInTime;
	private LocalDateTime checkOutTime;
	private String status;
	public AttendenceResponse() {
		super();
	}
	public AttendenceResponse(LocalDateTime date, LocalDateTime checkInTime, LocalDateTime checkOutTime,
			String status) {
		super();
		this.date = date;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalDateTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
