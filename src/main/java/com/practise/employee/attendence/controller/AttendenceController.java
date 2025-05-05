package com.practise.employee.attendence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.practise.employee.attendence.model.AttendenceResponse;
import com.practise.employee.attendence.model.AttendenceTodayResponse;
import com.practise.employee.attendence.model.CheckInResponse;
import com.practise.employee.attendence.model.CheckOutResponse;
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
	
	@PostMapping("checkout/{empId}")
	public CheckOutResponse employeeCheckOut(@PathVariable String empId) {
		return service.employeeCheckOutTime(empId);
	}
	
	@GetMapping("attendance/{empId}")
	public List<AttendenceResponse> employeeAttendence(@PathVariable String empId) {
		return service.employeeAttendanceResponse(empId);
	}
	
	@GetMapping("today")
	public List<AttendenceTodayResponse> presentDayAttendence(){
		return service.employeePresentDay();
	}

}
