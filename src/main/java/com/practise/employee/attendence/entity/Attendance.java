package com.practise.employee.attendence.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.practise.employee.leave.management.entity.Employees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long attendanceId;
	
	@ManyToOne
	@JoinColumn(name = "emp_Id")
	private Employees employee;
	
	private LocalDateTime attendanceDate;
	private LocalDateTime checkInTime;
	private LocalDateTime checkOutTime;
	private String status;
	public Attendance() {
		super();
	}
	public Attendance(long attendanceId, Employees employee, LocalDateTime attendanceDate, LocalDateTime checkInTime, LocalDateTime checkOutTime,
			String status) {
		super();
		this.attendanceId = attendanceId;
		this.employee = employee;
		this.attendanceDate = attendanceDate;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.status = status;
	}
	public long getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(long attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	public LocalDateTime getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(LocalDateTime attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
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
