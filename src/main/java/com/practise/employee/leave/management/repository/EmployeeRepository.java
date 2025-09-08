package com.practise.employee.leave.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practise.employee.leave.management.entity.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, String> {
	
	/*
	 * @Query(value =
	 * "selct * from employees e where e.department= :department",nativeQuery =
	 * true) Employees findDepartment(String department);
	 */
	List<Employees> findByDepartment(String department);
}
