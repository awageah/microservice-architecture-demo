package com.intellisc.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "emp_payment")
public class EmpPayment implements Serializable {

    public static final long serialVersionUID = -5038615455750914632L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "emp_id", nullable = false)
    private Integer empId;

    @Column(name = "payment_per_hour", nullable = false)
    private BigDecimal paymentPerHour;

    public EmpPayment() {

    }

    public EmpPayment(Integer empId, BigDecimal paymentPerHour) {
        this.empId = empId;
        this.paymentPerHour = paymentPerHour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public BigDecimal getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(BigDecimal paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
