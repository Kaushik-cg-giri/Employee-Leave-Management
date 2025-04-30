package com.practise.employee.leave.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.employee.leave.management.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, String> {

}
