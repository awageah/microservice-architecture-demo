package com.intellisc.demo.service;

import com.intellisc.demo.entity.EmpPayment;
import com.intellisc.demo.feign.client.AttendanceClient;
import com.intellisc.demo.repository.EmpPaymentRepository;
import com.intellisc.demo.ui.dto.AttendedHoursDto;
import com.intellisc.demo.ui.dto.PaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

@Service
public class EmpPaymentServiceImpl implements EmpPaymentService {

    @Autowired
    private EmpPaymentRepository empPaymentRepository;

    @Autowired
    private AttendanceClient attendanceClient;

    @Override
    public BigDecimal getPaymentPerHour(long empId) {
        Optional<EmpPayment> empPayment = empPaymentRepository.findById(empId);
        return empPayment.get().getPaymentPerHour();
    }

    @Override
    public PaymentDto getpayment(Long empId, Date dateFrom, Date dateTo) {
        PaymentDto paymentDto = new PaymentDto();

        BigDecimal paymentPerHour = this.getPaymentPerHour(empId);
        AttendedHoursDto attendedHours = this.attendanceClient.getAttendedHours(empId, dateFrom, dateTo);

        paymentDto.setPayment(paymentPerHour.multiply(new BigDecimal(attendedHours.getAttendedHours())));

        return paymentDto;
    }

}
