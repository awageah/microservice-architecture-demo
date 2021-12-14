package com.intellisc.demo.ui.controller;

import com.intellisc.demo.service.AttendanceService;
import com.intellisc.demo.ui.dto.AttendanceDto;
import com.intellisc.demo.ui.dto.AttendedHoursDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping(path = "/attend")
    public void attend(@RequestBody AttendanceDto attendanceDto) {
        attendanceService.attend(attendanceDto);
    }

    @GetMapping("/hours")
    public AttendedHoursDto getAttendedHours(@RequestParam(name = "emp_id") Long empId,
                                             @RequestParam(name = "date_from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFrom,
                                             @RequestParam(name = "date_to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateTo) {
        return attendanceService.getAttendedHours(empId, dateFrom, dateTo);
    }

}
