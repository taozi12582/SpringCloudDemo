package taozi.service;

import org.apache.ibatis.annotations.Param;
import taozi.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
