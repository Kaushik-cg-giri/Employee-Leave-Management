package com.practise.employee.perfomance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.employee.perfomance.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, String>{

}
