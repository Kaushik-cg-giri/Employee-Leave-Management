package com.practise.employee.leave.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<Response> leaveApply(@RequestBody LeaveRequest request) {
		
		return new ResponseEntity<Response>(service.leaveApplyService(request),HttpStatus.CREATED);
	}

	
}
