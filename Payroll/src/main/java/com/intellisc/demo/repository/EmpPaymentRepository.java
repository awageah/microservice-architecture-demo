package com.intellisc.demo.repository;

import com.intellisc.demo.entity.EmpPayment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpPaymentRepository extends CrudRepository<EmpPayment, Long> {

}
