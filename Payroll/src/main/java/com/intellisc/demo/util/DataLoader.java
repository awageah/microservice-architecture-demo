package com.intellisc.demo.util;

import com.intellisc.demo.entity.EmpPayment;
import com.intellisc.demo.repository.EmpPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class DataLoader implements ApplicationRunner {

    private EmpPaymentRepository empPaymentRepository;

    @Autowired
    public DataLoader(EmpPaymentRepository empPaymentRepository) {
        this.empPaymentRepository = empPaymentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.empPaymentRepository.save(new EmpPayment(1, new BigDecimal(100)));
        this.empPaymentRepository.save(new EmpPayment(2, new BigDecimal(120)));

    }
}
