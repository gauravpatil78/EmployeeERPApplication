package com.EmployeeERPApplication.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeERPApplication.service.DailyAttendanceTrackerService;

@RestController
@RequestMapping("/Attend")
public class DailyAttendanceTrackerController {

	@Autowired
	private DailyAttendanceTrackerService attendanceTrackerService;
	
	@PostMapping("/doPunchIn")
	public ResponseEntity<String> doPunchIn() {
		attendanceTrackerService.doPunchIn();
		return  ResponseEntity.ok("Checked in successfully");
	}
	
	@PutMapping("/doPunchOut")
	public ResponseEntity<String> doPunchOut() {
		attendanceTrackerService.doPunchOut();
		return ResponseEntity.ok("Check Out successfully");
	}
}
