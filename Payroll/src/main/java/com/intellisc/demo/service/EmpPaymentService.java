package com.intellisc.demo.service;

import com.intellisc.demo.ui.dto.PaymentDto;

import java.math.BigDecimal;
import java.util.Date;

public interface EmpPaymentService {

    BigDecimal getPaymentPerHour(long empId);

    PaymentDto getpayment(Long empId, Date dateFrom, Date dateTo);
}
