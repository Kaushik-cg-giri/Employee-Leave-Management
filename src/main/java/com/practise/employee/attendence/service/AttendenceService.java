package com.practise.employee.attendence.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employee.attendence.entity.Attendance;
import com.practise.employee.attendence.model.AttendenceResponse;
import com.practise.employee.attendence.model.AttendenceTodayResponse;
import com.practise.employee.attendence.model.CheckInResponse;
import com.practise.employee.attendence.model.CheckOutResponse;
import com.practise.employee.attendence.repository.AttendenceRepository;
import com.practise.employee.exception.AttendenceNotFound;
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

	public CheckOutResponse employeeCheckOutTime(String empId) {
		CheckOutResponse response = new CheckOutResponse();
		Employees employee = emploeeRepo.findById(empId).orElseThrow();
		Attendance attendance = attendanceRepo.findByEmployeeEmpIdAndAttendanceDate(empId, LocalDate.now());
		attendance.setcheckOutTime(LocalDateTime.now());
		attendance.setStatus("Present");
		attendanceRepo.save(attendance);
		
		response.setMessage("Check-out successful");
		response.setEmployeeId(empId);
		response.setcheckOutTime(LocalDateTime.now());
		response.setStatus("Present");

		return response;
	}

	public List<AttendenceResponse> employeeAttendanceResponse(String empId) {
		
		Employees employees = emploeeRepo.findById(empId).orElseThrow();
		List<Attendance> attendance = attendanceRepo.findByEmployeeEmpId(empId);
		List<AttendenceResponse> list = new ArrayList<AttendenceResponse>();
		
		for(Attendance itr: attendance) {
			AttendenceResponse response = new AttendenceResponse();
			response.setDate(itr.getAttendanceDate());
			response.setCheckInTime(itr.getCheckInTime());
			response.setCheckOutTime(itr.getcheckOutTime());
			response.setStatus(itr.getStatus());
			
			list.add(response);
		}
		
		return list;
	}

	public List<AttendenceTodayResponse> employeePresentDay() {
		
		List<Attendance> attendances = attendanceRepo.findByAttendanceDate(LocalDate.now());
		List<AttendenceTodayResponse> list = new ArrayList<AttendenceTodayResponse>();
		
		if(list.isEmpty())
			throw new AttendenceNotFound("Attendence Not found");
		
		for(Attendance itr :attendances) {
			AttendenceTodayResponse response = new AttendenceTodayResponse();
			response.setEmpId(itr.getEmployee().getEmpId());
			response.setEmpName(itr.getEmployee().getEmpName());
			response.setCheckInTime(itr.getCheckInTime());
			response.setCheckOutTime(itr.getcheckOutTime());
			response.setStatus(itr.getStatus());
			
			
			list.add(response);
		}
		return list;
	}

}
