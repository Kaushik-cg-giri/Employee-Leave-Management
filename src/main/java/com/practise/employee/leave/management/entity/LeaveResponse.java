package com.practise.employee.leave.management.entity;

import org.springframework.stereotype.Component;

@Component
public class LeaveResponse implements Response{
	
	private String employeeId;
	private String leaveType;
	private int daysRequested;
	private int leaveBalanceBefore;
	private int leaveBalanceAfter;
	private String status;

	public LeaveResponse() {
		super();
	}
	public LeaveResponse(String employeeId, String leaveType, int daysRequested, int leaveBalanceBefore,
			int leaveBalanceAfter, String status) {
		super();
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.daysRequested = daysRequested;
		this.leaveBalanceBefore = leaveBalanceBefore;
		this.leaveBalanceAfter = leaveBalanceAfter;
		this.status = status;
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
	public int getLeaveBalanceBefore() {
		return leaveBalanceBefore;
	}
	public void setLeaveBalanceBefore(int leaveBalanceBefore) {
		this.leaveBalanceBefore = leaveBalanceBefore;
	}
	public int getLeaveBalanceAfter() {
		return leaveBalanceAfter;
	}
	public void setLeaveBalanceAfter(int leaveBalanceAfter) {
		this.leaveBalanceAfter = leaveBalanceAfter;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
