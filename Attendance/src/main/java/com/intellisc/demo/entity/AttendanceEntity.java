package com.intellisc.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "attendance")
public class AttendanceEntity implements Serializable {

    public static final long serialVersionUID = 3694532172882565074L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "emp_id", nullable = false)
    private Long employeeId;

    @Column(name = "attend_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date attendDate;

    @Column(name = "attend_hours", nullable = false)
    private Integer attendHours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
