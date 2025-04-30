package com.practise.employee.leave.management.entity;

import org.springframework.stereotype.Component;

@Component
public class LeaveRequest {

	private String employeeId;
	private String leaveType;
	private int daysRequested;
	public LeaveRequest() {
		super();
	}
	public LeaveRequest(String employeeId, String leaveType, int daysRequested) {
		super();
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.daysRequested = daysRequested;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public int getDaysRequested() {
		return daysRequested;
	}
	public void setDaysRequested(int daysRequested) {
		this.daysRequested = daysRequested;
	}
	
	
}
