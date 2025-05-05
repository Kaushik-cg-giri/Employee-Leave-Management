package com.practise.employee.perfomance.model;

public class TopPerformersResponse {

	
	private String employeeId;
	private String employeeName;
	private float averageRating;
	public TopPerformersResponse() {
		super();
	}
	public TopPerformersResponse(String employeeId, String employeeName, float averageRating) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.averageRating = averageRating;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	
	

}
