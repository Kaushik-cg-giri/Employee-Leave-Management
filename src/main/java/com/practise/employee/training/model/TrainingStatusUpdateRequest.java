package com.practise.employee.training.model;

public class TrainingStatusUpdateRequest {

	private String employeeId;
	private long trainingSessionId;
	private String status;
	
	public TrainingStatusUpdateRequest() {
		super();
	}

	public TrainingStatusUpdateRequest(String employeeId, long trainingSessionId, String status) {
		super();
		this.employeeId = employeeId;
		this.trainingSessionId = trainingSessionId;
		this.status = status;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public long getTrainingSessionId() {
		return trainingSessionId;
	}

	public void setTrainingSessionId(long trainingSessionId) {
		this.trainingSessionId = trainingSessionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
