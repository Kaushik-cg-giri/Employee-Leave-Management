package com.practise.employee.perfomance.entity;

import java.time.LocalDate;

import com.practise.employee.leave.management.entity.Employees;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class PerfomanceReview {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	@ManyToOne
	@JoinColumn(name = "employee_Id")
	private Employees employee;
	private LocalDate reviewDate;
	private float rating;
	private String comments;
	private String managerId;
	public PerfomanceReview() {
		super();
	}
	public PerfomanceReview(Employees employee, LocalDate reviewDate, float rating, String comments,
			String managerId) {
		super();
		this.employee = employee;
		this.reviewDate = reviewDate;
		this.rating = rating;
		this.comments = comments;
		this.managerId = managerId;
	}
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
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
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
}
