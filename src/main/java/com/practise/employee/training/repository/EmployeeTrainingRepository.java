package com.practise.employee.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.employee.leave.management.entity.Employees;
import com.practise.employee.training.entity.EmployeeTraining;
import com.practise.employee.training.entity.TrainingSession;

@Repository
public interface EmployeeTrainingRepository extends JpaRepository<EmployeeTraining, Long> {
	
	EmployeeTraining findByEmployeeEmpIdAndTrainingId(String empId,long trainingId);
	

}
