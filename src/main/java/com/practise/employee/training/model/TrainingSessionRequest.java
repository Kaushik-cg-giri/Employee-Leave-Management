package com.practise.employee.training.model;

import java.time.LocalDate;

public class TrainingSessionRequest {

	private String topic;
	private LocalDate date;
	private String duration;
	private String trainer;
	private String department;
	

	public TrainingSessionRequest() {
		super();
	}


	public TrainingSessionRequest(String topic, LocalDate date, String duration, String trainer, String department) {
		super();
		this.topic = topic;
		this.date = date;
		this.duration = duration;
		this.trainer = trainer;
		this.department = department;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
