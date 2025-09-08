package com.practise.employee.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.practise.employee.leave.management.entity.Employees;
import com.practise.employee.leave.management.repository.EmployeeRepository;
import com.practise.employee.training.entity.EmployeeTraining;
import com.practise.employee.training.entity.TrainingSession;
import com.practise.employee.training.model.Response;
import com.practise.employee.training.model.TrainingSessionRequest;
import com.practise.employee.training.model.TrainingStatusUpdateRequest;
import com.practise.employee.training.repository.EmployeeTrainingRepository;
import com.practise.employee.training.repository.TrainingSessionRepository;

@Service
public class TrainingSessionService {
	@Autowired
	private TrainingSessionRepository trainingSessionRepo;
	@Autowired
	private EmployeeTrainingRepository empTraingSessionRepo;
	@Autowired
	private EmployeeRepository empRepository;

	public Response trainingSession(TrainingSessionRequest req) {
		
		TrainingSession session = new TrainingSession();
		Response reponse = new Response();
		session.setTopics(req.getTopic());
		session.setDate(req.getDate());
		session.setDuration(req.getDuration());
		session.setTrainer(req.getTrainer());
		session.setDepartment(req.getDepartment());
		
		trainingSessionRepo.save(session);
		reponse.setStatus("true");
		reponse.setMessage("Training session created sucessfully");
		
		return reponse;
	}

	public Response assignSession(String topic, String department) {
		
		TrainingSession training =trainingSessionRepo.findByTopics(topic);
		List<Employees> empls =empRepository.findByDepartment(department);
		Response response = new Response();
		
		for(Employees emp : empls) {
			EmployeeTraining empTraining = new EmployeeTraining();
			
			empTraining.setEmployee(emp);
			empTraining.setTraining(training);
			empTraining.setStatus("Scheduled");
			
			empTraingSessionRepo.save(empTraining);
			response.setStatus("true");
			response.setMessage("For "+ department +" Department "+topic+" assigned");
		}
		return response;
	}

	public Response updateTrainingStatusEmp(TrainingStatusUpdateRequest updateReq) {

		Response response = new Response();

		
		EmployeeTraining empTraining = empTraingSessionRepo.findByEmployeeEmpIdAndTrainingId(updateReq.getEmployeeId(), updateReq.getTrainingSessionId());
		empTraining.setStatus(updateReq.getStatus());
		
		empTraingSessionRepo.save(empTraining);
		response.setStatus("true");
		response.setMessage("Status updated Sucessfully");
		
		return response;
	}

}
