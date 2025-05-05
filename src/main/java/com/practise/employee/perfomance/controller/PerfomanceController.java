package com.practise.employee.perfomance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.employee.perfomance.model.PerfomanceAllResponse;
import com.practise.employee.perfomance.model.PerfomanceRequest;
import com.practise.employee.perfomance.model.PerfomanceResponse;
import com.practise.employee.perfomance.model.TopPerformersResponse;
import com.practise.employee.perfomance.service.PerfomanceService;

@RestController
@RequestMapping("perfomance")
public class PerfomanceController {
	@Autowired
	private PerfomanceService service;
	
	@PostMapping("reviews")
	public PerfomanceResponse insertReview(@RequestBody PerfomanceRequest req) {	
		 return service.addReview(req);
	}
	
	@GetMapping("reviews/{empId}")
	public List<PerfomanceAllResponse> perfomanceOfEmployee(@PathVariable String empId){
		return service.employeeReviews(empId);
	}
	
	@GetMapping("reviews/top-performers")
	public List<TopPerformersResponse> topPerformers(@RequestParam("minRating") float rating){
		return service.topPerformersRating(rating);
	}

}
