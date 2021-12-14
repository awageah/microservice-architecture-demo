package com.intellisc.demo.ui.controller;

import com.intellisc.demo.service.EmpPaymentService;
import com.intellisc.demo.ui.dto.PaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/payroll")
public class PayrollController {

    @Autowired
    private EmpPaymentService empPaymentService;

    @GetMapping("/payment")
    public PaymentDto getAttendedHours(@RequestParam(name = "emp_id") Long empId,
                                       @RequestParam(name = "date_from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFrom,
                                       @RequestParam(name = "date_to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateTo) {
        return empPaymentService.getpayment(empId, dateFrom, dateTo);
    }

}
