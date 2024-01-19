package com.EmployeeERPApplication.service;


import org.springframework.stereotype.Service;

@Service
public interface DailyAttendanceTrackerService {

	public String doPunchIn();
	
	public String doPunchOut();
}
