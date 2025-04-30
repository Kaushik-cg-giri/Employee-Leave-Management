package com.practise.employee.attendence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.employee.attendence.model.CheckInResponse;
import com.practise.employee.attendence.service.AttendenceService;

@RestController
@RequestMapping("attendance")
public class AttendenceController {
	
	@Autowired
	private AttendenceService service;
	
	@PostMapping("checkin/{empId}")
	public CheckInResponse employeeCheckIn(@PathVariable("empId") String empId) {
		return service.employeeCheckInTime(empId);
	}

}
