package com.practise.employee.leave.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.employee.leave.management.entity.LeaveRequest;
import com.practise.employee.leave.management.entity.LeaveResponse;
import com.practise.employee.leave.management.entity.Response;
import com.practise.employee.leave.management.service.LeaveService;

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
