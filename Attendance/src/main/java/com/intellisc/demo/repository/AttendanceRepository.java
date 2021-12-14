package com.intellisc.demo.repository;

import com.intellisc.demo.entity.AttendanceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AttendanceRepository extends CrudRepository<AttendanceEntity, Long> {

    @Query("SELECT sum(a.attendHours) FROM AttendanceEntity a WHERE a.employeeId = :empId and a.attendDate between :dateFrom and :dateTo")
    Integer getAttendedHours(Long empId, Date dateFrom, Date dateTo);

}
