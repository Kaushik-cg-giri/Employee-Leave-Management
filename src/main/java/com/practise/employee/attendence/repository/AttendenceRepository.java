package com.practise.employee.attendence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.employee.attendence.entity.Attendance;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendance, Long> {

}
