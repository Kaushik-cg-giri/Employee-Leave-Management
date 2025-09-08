package com.practise.employee.leave.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_types")
public class LeaveTypes {

	@Id
	@Column(name = "leave_type")
	private String leaveType;
	@Column(name = "leave_disc")
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
