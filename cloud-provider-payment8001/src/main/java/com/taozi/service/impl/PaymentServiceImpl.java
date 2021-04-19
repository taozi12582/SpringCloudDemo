package com.taozi.service.impl;

import org.springframework.stereotype.Service;
import com.taozi.dao.PaymentDao;
import com.taozi.entities.Payment;
import com.taozi.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
