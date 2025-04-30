package com.practise.employee.leave.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employee.leave.management.entity.InsufficientResponse;
import com.practise.employee.leave.management.entity.LeaveCount;
import com.practise.employee.leave.management.entity.LeaveRequest;
import com.practise.employee.leave.management.entity.LeaveResponse;
import com.practise.employee.leave.management.entity.Response;
import com.practise.employee.leave.management.exception.LeaveException;
import com.practise.employee.leave.management.repository.LeaveTotalRepository;

@Service
public class LeaveService {

	@Autowired
	private LeaveTotalRepository repo;
	
	LeaveCount leaveCount = new LeaveCount();
	

	
	
	public Response leaveApplyService(LeaveRequest request) {
		
		LeaveCount leaveDtls = repo.findTotalLeaveByType(request.getEmployeeId(),request.getLeaveType());
		
		System.out.println("service layer");
		
		int balanceLeaveAfterApply = leaveDtls.gettotalLeave() - request.getDaysRequested();
		
		if(balanceLeaveAfterApply > 0) {
			
			LeaveResponse sucessResponse = new LeaveResponse();
			sucessResponse.setEmployeeId(request.getEmployeeId());
			sucessResponse.setLeaveType(request.getLeaveType());
			sucessResponse.setDaysRequested(request.getDaysRequested());
			sucessResponse.setLeaveBalanceBefore(leaveDtls.gettotalLeave());
			sucessResponse.setLeaveBalanceAfter(balanceLeaveAfterApply);
			sucessResponse.setStatus("Approved");
			
			leaveDtls.settotalLeave(balanceLeaveAfterApply);
			repo.save(leaveDtls);
			return sucessResponse;
		}
		else {
			InsufficientResponse failureResponse = new InsufficientResponse();
			failureResponse.setStatus("Rejected");
			failureResponse.setMessage("Insufficient leave balance");
			
			return failureResponse;
		}
		
		
		
		
	}
	
	

}
