package com.practise.employee.training.entity;

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
@Table(name = "employee_training")
public class EmployeeTraining {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employees employee;
	@ManyToOne
	@JoinColumn(name = "training_id")
	private TrainingSession training;
	private String status;

	public EmployeeTraining() {

	}

	public EmployeeTraining(long id, Employees employee, TrainingSession training, String status) {
		super();
		this.id = id;
		this.employee = employee;
		this.training = training;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public TrainingSession getTraining() {
		return training;
	}

	public void setTraining(TrainingSession training) {
		this.training = training;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
