package com.EmployeeERPApplication.serviceImpl;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeERPApplication.entity.DailyAttendanceTracker;
import com.EmployeeERPApplication.repository.DailyAttendanceTrackerRepository;
import com.EmployeeERPApplication.service.DailyAttendanceTrackerService;

@Service
public class DailyAttendanceTrackerServiceImpl implements DailyAttendanceTrackerService {

	@Autowired
	private DailyAttendanceTrackerRepository attendanceTrackerRepository;

	@Override
	public String doPunchIn() {
		DailyAttendanceTracker attendanceTracker = new DailyAttendanceTracker();
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter punchInTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedPunchInTime = currentTime.format(punchInTime);
		attendanceTracker.setLocalDate(currentDate);
		attendanceTracker.setPunchIn(formattedPunchInTime);
		attendanceTracker.setEmpId("10296");
		attendanceTrackerRepository.save(attendanceTracker);
		return "Punch in Success";
	}

	@Override
	public String doPunchOut() {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter punchOutTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedPunchOutTime = currentTime.format(punchOutTimeFormatter);
		Optional<DailyAttendanceTracker> punchInStatus = attendanceTrackerRepository.getPunchInStatus(currentDate,
				"10296");
		if (punchInStatus.isPresent()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

			LocalTime localTime1 = LocalTime.parse(punchInStatus.get().getPunchIn(), formatter);
			LocalTime localTime2 = LocalTime.parse(formattedPunchOutTime, formatter);

			Duration duration = Duration.between(localTime1, localTime2);

			String totalWorkHours = String.valueOf(duration.toHours()) + ":" + String.valueOf(duration.toMinutesPart())
					+ ":" + String.valueOf(duration.toSecondsPart());

			System.out.println(totalWorkHours);
			attendanceTrackerRepository.doPunchOut(currentDate, "10296", formattedPunchOutTime, totalWorkHours);
			return "Punch out Success";
		} else {
			throw new RuntimeException("Please Do Punch In");
		}
	}

}
