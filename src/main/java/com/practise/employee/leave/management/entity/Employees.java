package com.practise.employee.leave.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
	
	@Id
	private String empId;
	private String empName;
	
	public Employees() {
		super();
	}

	public Employees(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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
	
	

}
