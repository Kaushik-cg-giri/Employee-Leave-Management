package com.practise.employee.perfomance.entity;

import java.time.LocalDate;

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
@Table(name = "perfomance_review")
public class PerfomanceReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	private long reviewId;
	@ManyToOne
	@JoinColumn(name = "employee_Id")
	private Employees employee;
	@Column(name ="review_date")
	private LocalDate reviewDate;
	@Column(name ="rating")
	private float rating;
	private String comments;
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Manager manager;
	public PerfomanceReview() {
		super();
	}
	public PerfomanceReview(Employees employee, LocalDate reviewDate, float rating, String comments,
			Manager manager) {
		super();
		this.employee = employee;
		this.reviewDate = reviewDate;
		this.rating = rating;
		this.comments = comments;
		this.manager = manager;
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
	public Manager  getManager() {
		return manager;
	}
	public void setManagerId(Manager manager) {
		this.manager = manager;
	}
	
	
}
