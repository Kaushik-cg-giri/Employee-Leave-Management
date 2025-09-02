package com.practise.employee.attendence.entity;

import java.time.LocalDate;
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
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long attendanceId;
	
	@ManyToOne
	@JoinColumn(name = "emp_Id")
	private Employees employee;
	@Column(name="attendance_date")
	private LocalDate attendanceDate;
	@Column(name ="check_in_time")
	private LocalDateTime checkInTime;
	@Column(name = "check_out_time")
	private LocalDateTime checkOutTime;
	private String status;
	public Attendance() {
		super();
	}
	public Attendance(long attendanceId, Employees employee, LocalDate attendanceDate, LocalDateTime checkInTime, LocalDateTime checkOutTime,
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
	public LocalDate getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(LocalDate attendanceDate) {
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
