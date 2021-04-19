package taozi.service;

import com.taozi.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
