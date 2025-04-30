package com.practise.employee.leave.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LeaveTypes {

	@Id
	private String leaveType;
	private String leaveDisc;
	
	public LeaveTypes() {
		super();
	}

	public LeaveTypes(String leaveType, String leaveDisc) {
		super();
		this.leaveType = leaveType;
		this.leaveDisc = leaveDisc;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getLeaveDisc() {
		return leaveDisc;
	}

	public void setLeaveDisc(String leaveDisc) {
		this.leaveDisc = leaveDisc;
	}
	
	
	
	
}
