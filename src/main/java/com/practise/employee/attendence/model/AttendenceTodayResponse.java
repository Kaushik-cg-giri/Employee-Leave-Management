package com.practise.employee.attendence.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AttendenceTodayResponse {
	
	private String empId;
	private String empName;
	private LocalDateTime checkInTime;
	private LocalDateTime checkOutTime;
	private String status;
	public AttendenceTodayResponse() {
		super();
	}
	public AttendenceTodayResponse(String empId, String empName, LocalDateTime checkInTime, LocalDateTime checkOutTime,
			String status) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.status = status;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
