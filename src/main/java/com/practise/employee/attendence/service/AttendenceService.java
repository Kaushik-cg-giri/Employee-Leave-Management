package com.practise.employee.attendence.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employee.attendence.entity.Attendance;
import com.practise.employee.attendence.model.CheckInResponse;
import com.practise.employee.attendence.repository.AttendenceRepository;
import com.practise.employee.leave.management.entity.Employees;
import com.practise.employee.leave.management.repository.EmployeeRepository;

@Service
public class AttendenceService {
	
	@Autowired
	private AttendenceRepository attendanceRepo;
	@Autowired
	private EmployeeRepository emploeeRepo;

	public CheckInResponse employeeCheckInTime(String empId) {
		
		Employees employee = emploeeRepo.findById(empId).orElseThrow();
		CheckInResponse response = new CheckInResponse();
		
		Attendance attendance = new Attendance();
		//attendance.setAttendanceId(109);
		attendance.setEmployee(employee);
		attendance.setAttendanceDate(LocalDate.now());
		attendance.setCheckInTime(LocalDateTime.now());
		attendance.setcheckOutTime(null);
		attendance.setStatus("Pending Checkout");
		
		attendanceRepo.save(attendance);
		
		response.setMessage("Check-in successful");
		response.setEmployeeId(employee.getEmpId());
		response.setCheckInTime(attendance.getCheckInTime());
		response.setStatus("Pending Checkout");
		
		return response;
	}

}
