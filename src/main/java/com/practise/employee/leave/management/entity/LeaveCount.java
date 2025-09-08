package com.practise.employee.leave.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leave_count")
public class LeaveCount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="leave_id")
	private Integer leaveId;
	@Column(name = "employee_id")
	private String employeeId;
	@Column(name ="leave_type")
	private String leaveType;
	@Column(name = "total_leave")
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
