package com.practise.employee.perfomance.model;

import java.time.LocalDate;

public class PerfomanceAllResponse {

	private long reviewId;
	private LocalDate reviewDate;
	private float rating;
	private String comments;
	private String reviewer;
	public PerfomanceAllResponse() {
		super();
	}
	public PerfomanceAllResponse(long reviewId, LocalDate reviewDate, float rating, String comments, String reviewer) {
		super();
		this.reviewId = reviewId;
		this.reviewDate = reviewDate;
		this.rating = rating;
		this.comments = comments;
		this.reviewer = reviewer;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
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
