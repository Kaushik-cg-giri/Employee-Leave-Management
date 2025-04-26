package com.APIPractise.Employee.Leave.Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIPractise.Employee.Leave.Management.entities.LeaveRequest;
import com.APIPractise.Employee.Leave.Management.entities.LeaveResponse;
import com.APIPractise.Employee.Leave.Management.entities.Response;
import com.APIPractise.Employee.Leave.Management.service.LeaveService;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {
	
	@Autowired
	private LeaveService service;
	
	
	@PostMapping("/apply")
	public Response leaveApply(@RequestBody LeaveRequest request) {
		
		return service.leaveApplyService(request);
	}

	
}
