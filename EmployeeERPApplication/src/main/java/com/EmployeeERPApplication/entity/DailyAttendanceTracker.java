package com.EmployeeERPApplication.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "daily_attendance_tracker")
public class DailyAttendanceTracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "local_date")
	private LocalDate localDate;
	
	@Column(name = "punch_in")
	private String punchIn;
	
	@Column(name = "punch_out")
	private String punchOut;
	
	@Column(name = "emp_id")
	private String empId;
	
	@Column(name = "total_work_hours")
	private String totalWorkHours;
	
	
}
