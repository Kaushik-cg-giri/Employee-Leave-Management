package com.practise.employee.perfomance.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practise.employee.perfomance.entity.PerfomanceReview;

@Repository
public interface PerfomanceRepository extends JpaRepository<PerfomanceReview, Long> {

	List<PerfomanceReview> findAllByEmployeeEmpId(String empId);
	
	@Query(value = "SELECT * FROM PERFOMANCE_REVIEW WHERE RATING>=:n",nativeQuery = true)
	List<PerfomanceReview> findAllByRatingGreaterThan(float n);
	//List<PerfomanceReview>findAllByRatingGreaterThanEqual(float n);
	
	PerfomanceReview findByReviewDateAndEmployeeEmpId(LocalDate date,String emplId);
	
}
