package com.practise.employee.perfomance.model;

import java.time.LocalDate;

public class PerfomanceResponse {

	private String message;
	private long reviewId;
	private String employeeId;
	private float rating;
	private LocalDate reviewDate;
	public PerfomanceResponse() {
		super();
	}
	public PerfomanceResponse(String message, long reviewId, String employeeId, float rating, LocalDate reviewDate) {
		super();
		this.message = message;
		this.reviewId = reviewId;
		this.employeeId = employeeId;
		this.rating = rating;
		this.reviewDate = reviewDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public LocalDate getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}
	
	
}
