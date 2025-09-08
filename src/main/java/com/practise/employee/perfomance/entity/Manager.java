package com.practise.employee.perfomance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {
	@Id
	@Column(name="manager_id")
	private String managerId;
	@Column(name = "manager_name")
	private String managerName;
	@Column(name ="department")
	private String department;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String managerId, String managerName, String department) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.department = department;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
