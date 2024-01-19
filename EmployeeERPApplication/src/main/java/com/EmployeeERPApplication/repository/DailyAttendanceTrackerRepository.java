package com.EmployeeERPApplication.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.EmployeeERPApplication.entity.DailyAttendanceTracker;

@Repository
public interface DailyAttendanceTrackerRepository extends JpaRepository<DailyAttendanceTracker, Integer> {

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update DailyAttendanceTracker d set d.punchOut=:punchOut, d.totalWorkHours=:totalHours where d.localDate=:localDate and d.empId=:empId")
	public void doPunchOut(LocalDate localDate,String empId,String punchOut,String totalHours);
	
	@Query("select u from DailyAttendanceTracker u where u.localDate=:localDate and u.empId=:empId")
	public Optional<DailyAttendanceTracker> getPunchInStatus(LocalDate localDate,String empId);
}
