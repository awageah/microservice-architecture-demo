package com.intellisc.demo.service;

import com.intellisc.demo.ui.dto.AttendanceDto;
import com.intellisc.demo.ui.dto.AttendedHoursDto;

import java.util.Date;

public interface AttendanceService {

    public void attend(AttendanceDto attendanceDto);

    AttendedHoursDto getAttendedHours(Long empId, Date dateFrom, Date dateTo);
}
