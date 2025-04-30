package com.practise.employee.leave.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practise.employee.leave.management.entity.LeaveCount;

@Repository
public interface LeaveTotalRepository extends JpaRepository<LeaveCount, Integer> {
	
	@Query(value = "SELECT * FROM LEAVE_COUNT WHERE EMPLOYEE_ID= :employeeId AND LEAVE_TYPE= :leaveType",nativeQuery = true)
	LeaveCount findTotalLeaveByType(@Param("employeeId") String empID,@Param("leaveType") String type);

}
