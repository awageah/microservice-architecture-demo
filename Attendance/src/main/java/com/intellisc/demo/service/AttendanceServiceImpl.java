package com.intellisc.demo.service;

import com.intellisc.demo.entity.AttendanceEntity;
import com.intellisc.demo.repository.AttendanceRepository;
import com.intellisc.demo.ui.dto.AttendanceDto;
import com.intellisc.demo.ui.dto.AttendedHoursDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepo;

    @Override
    public void attend(AttendanceDto attendanceDto) {
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        AttendanceEntity attendanceEntity = mm.map(attendanceDto, AttendanceEntity.class);
        attendanceRepo.save(attendanceEntity);
    }

    @Override
    public AttendedHoursDto getAttendedHours(Long empId, Date dateFrom, Date dateTo) {
        AttendedHoursDto attendedHoursDto = new AttendedHoursDto();
        attendedHoursDto.setAttendedHours(attendanceRepo.getAttendedHours(empId, dateFrom, dateTo));

        return attendedHoursDto;
    }

}
