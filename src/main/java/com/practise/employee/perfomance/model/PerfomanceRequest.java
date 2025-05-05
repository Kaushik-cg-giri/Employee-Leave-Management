package com.practise.employee.perfomance.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PerfomanceRequest {
	
	private String employeeId;
	private LocalDate reviewDate;
	private float rating;
	private String comments;
	private String reviewer;
	public PerfomanceRequest() {
		super();
	}
	public PerfomanceRequest(String employeeId, LocalDate reviewDate, float rating, String comments, String reviewer) {
		super();
		this.employeeId = employeeId;
		this.reviewDate = reviewDate;
		this.rating = rating;
		this.comments = comments;
		this.reviewer = reviewer;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	
	
}
