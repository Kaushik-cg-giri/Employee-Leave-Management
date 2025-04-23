package com.APIPractise.Employee.Leave.Management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveCount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer leaveId;
	private String employeeId;
	private String leaveType;
	private int totalLeave;
	
	public LeaveCount() {
		super();
	}

	public LeaveCount(int leaveId, String employeeId, String leaveType, int totalLeave) {
		super();
		this.leaveId = leaveId;
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.totalLeave = totalLeave;
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
	public int gettotalLeave() {
		return totalLeave;
	}
	public void settotalLeave(int totalLeave) {
		this.totalLeave = totalLeave;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	
	

}
