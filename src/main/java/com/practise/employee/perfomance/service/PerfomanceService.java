package com.practise.employee.perfomance.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employee.exception.MoreThanOneReviewForEmployeeNotSuitable;
import com.practise.employee.exception.NoPerfomanceReviewFound;
import com.practise.employee.exception.PerfomanceRatingNotSuitable;
import com.practise.employee.leave.management.entity.Employees;
import com.practise.employee.leave.management.repository.EmployeeRepository;
import com.practise.employee.perfomance.entity.Manager;
import com.practise.employee.perfomance.entity.PerfomanceReview;
import com.practise.employee.perfomance.model.PerfomanceAllResponse;
import com.practise.employee.perfomance.model.PerfomanceRequest;
import com.practise.employee.perfomance.model.PerfomanceResponse;
import com.practise.employee.perfomance.model.TopPerformersResponse;
import com.practise.employee.perfomance.repository.ManagerRepository;
import com.practise.employee.perfomance.repository.PerfomanceRepository;

@Service
public class PerfomanceService {
	
	@Autowired
	private PerfomanceRepository repository;
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private ManagerRepository mangRepository;

	public PerfomanceResponse addReview(PerfomanceRequest req) {
		PerfomanceResponse response = new PerfomanceResponse();
	
		Employees emp = empRepository.findById(req.getEmployeeId()).orElseThrow();   
		Manager manager = mangRepository.findById(req.getReviewer()).orElseThrow();

		
		PerfomanceReview revwAtTtime =repository.findByReviewDateAndEmployeeEmpId(req.getReviewDate(), req.getEmployeeId());
		if(revwAtTtime!= null)
			throw new MoreThanOneReviewForEmployeeNotSuitable("More Than one Review Not Possible for Employee Per Day");
		
		
		PerfomanceReview review = new PerfomanceReview(emp, req.getReviewDate(), req.getRating(),req.getComments(), manager);
		repository.save(review);
		
		if(req.getRating()>5 || req.getRating()<1)
			throw new PerfomanceRatingNotSuitable("Perfomance Rating is between 1 and 5");
		response.setMessage("Review submitted successfully");
		response.setReviewId(review.getReviewId());
		response.setEmployeeId(req.getEmployeeId());
		response.setRating(req.getRating());
		response.setReviewDate(req.getReviewDate());
		
		
		return response;
	}

	public List<PerfomanceAllResponse> employeeReviews(String employeeId) {
		
		List<PerfomanceReview> reviews = repository.findAllByEmployeeEmpId(employeeId);
		
		if(reviews.isEmpty())
			throw new NoPerfomanceReviewFound("No Perfomance Review found for this EmployeeId :"+employeeId);
		
		List<PerfomanceAllResponse> list = new ArrayList<PerfomanceAllResponse>();
		
		for(PerfomanceReview rvw : reviews) {
			PerfomanceAllResponse response = new PerfomanceAllResponse();
			
			response.setReviewId(rvw.getReviewId());
			response.setReviewDate(rvw.getReviewDate());
			response.setRating(rvw.getRating());
			response.setComments(rvw.getComments());
			response.setReviewer(rvw.getManager().getManagerId());
			
			list.add(response);
		}
		
		return list;
	}

	public List<TopPerformersResponse> topPerformersRating(float rating) {
		
		List<PerfomanceReview> topList = repository.findAllByRatingGreaterThan(rating);
		List<TopPerformersResponse> list =  new ArrayList<TopPerformersResponse>();
		

		
		for(PerfomanceReview top : topList) {
			TopPerformersResponse response = new TopPerformersResponse();
			response.setEmployeeId(top.getEmployee().getEmpId());
			response.setEmployeeName(top.getEmployee().getEmpName());
			response.setAverageRating(top.getRating());
			
			list.add(response);
			
		}

		return list;
	}

}
