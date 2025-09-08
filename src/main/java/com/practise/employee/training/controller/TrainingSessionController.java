package com.practise.employee.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.employee.training.model.Response;
import com.practise.employee.training.model.TrainingSessionRequest;
import com.practise.employee.training.model.TrainingStatusUpdateRequest;
import com.practise.employee.training.service.TrainingSessionService;

@RestController 
@RequestMapping("api")
public class TrainingSessionController {

	@Autowired
	private TrainingSessionService service;
	
	@PostMapping("TrainingSession")
	public Response submitTrainingSession(@RequestBody TrainingSessionRequest req) {
		
		return service.trainingSession(req);
		
	}
	
	@PostMapping("TrainingSession/assign")
	public Response assignSessionBasedDeparmnt(@RequestParam(name ="topic") String topic,@RequestParam("department") String department) {
		
		return service.assignSession(topic,department);
	}
	
	@PutMapping("TrainingSesssion/status")	
	public Response updateStatus(@RequestBody TrainingStatusUpdateRequest updateReq) {
		
		return service.updateTrainingStatusEmp(updateReq);
	}



}
