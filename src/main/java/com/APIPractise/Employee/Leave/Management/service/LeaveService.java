package com.APIPractise.Employee.Leave.Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIPractise.Employee.Leave.Management.Exception.LeaveException;
import com.APIPractise.Employee.Leave.Management.entities.InsufficientResponse;
import com.APIPractise.Employee.Leave.Management.entities.LeaveCount;
import com.APIPractise.Employee.Leave.Management.entities.LeaveRequest;
import com.APIPractise.Employee.Leave.Management.entities.LeaveResponse;
import com.APIPractise.Employee.Leave.Management.entities.Response;
import com.APIPractise.Employee.Leave.Management.repository.LeaveTotalRepository;

@Service
public class LeaveService {

	@Autowired
	private LeaveTotalRepository repo;
	
	LeaveCount leaveCount = new LeaveCount();
	

	
	
	public Response leaveApplyService(LeaveRequest request) {
		
		LeaveCount leaveDtls = repo.findTotalLeaveByType(request.getEmployeeId(),request.getLeaveType());
		
		
		
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
