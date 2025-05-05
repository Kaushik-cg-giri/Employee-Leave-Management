package com.practise.employee.attendence.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practise.employee.attendence.entity.Attendance;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendance, Long> {
	
	//@Query(value = "SELECT * FROM ATTENDANCE WHERE EMP_ID =:empId AND ATTENDANCE_DATE =:attendancedate",nativeQuery = true)
	Attendance findByEmployeeEmpIdAndAttendanceDate(String empId,LocalDate date);
	List<Attendance> findByEmployeeEmpId(String empId);
	List<Attendance> findByAttendanceDate(LocalDate date);
}
