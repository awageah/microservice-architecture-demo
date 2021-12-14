package com.intellisc.demo.ui.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class AttendanceDto {

    private Long employeeId;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date attendDate;

    private Integer attendHours;

    public AttendanceDto() {

    }

    public AttendanceDto(Long employeeId, Date attendDate, Integer attendHours) {
        this.employeeId = employeeId;
        this.attendDate = attendDate;
        this.attendHours = attendHours;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(Date attendDate) {
        this.attendDate = attendDate;
    }

    public Integer getAttendHours() {
        return attendHours;
    }

    public void setAttendHours(Integer attendHours) {
        this.attendHours = attendHours;
    }
}
