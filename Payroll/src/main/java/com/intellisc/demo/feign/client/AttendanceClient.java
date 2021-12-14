package com.intellisc.demo.feign.client;

import com.intellisc.demo.ui.dto.AttendedHoursDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@FeignClient(name = "attendance-ws")
public interface AttendanceClient {

    @GetMapping("/attendance/hours")
    public AttendedHoursDto getAttendedHours(@RequestParam(name = "emp_id") Long empId,
                                             @RequestParam(name = "date_from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFrom,
                                             @RequestParam(name = "date_to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateTo);

}
