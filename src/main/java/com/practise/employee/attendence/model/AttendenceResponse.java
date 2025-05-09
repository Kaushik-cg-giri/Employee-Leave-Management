package com.practise.employee.attendence.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AttendenceResponse {

	private LocalDate date;
	private LocalDateTime checkInTime;
	private LocalDateTime checkOutTime;
	private String status;
	public AttendenceResponse() {
		super();
	}
	public AttendenceResponse(LocalDate date, LocalDateTime checkInTime, LocalDateTime checkOutTime,
			String status) {
		super();
		this.date = date;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.status = status;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
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
