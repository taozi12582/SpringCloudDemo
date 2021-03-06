package taozi.controller;

import com.taozi.entities.CommonResult;
import com.taozi.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import taozi.service.PaymentService;

import javax.annotation.Resource;

@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int res = paymentService.create(payment);
        System.out.println(payment.toString());
        log.info("---插入结果：" + res);
        if (res > 0) {
            return new CommonResult(200, "插入成功", res);
        } else {
            return new CommonResult(444, "插入失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
//        log.info("---查询结果：" + paymentById.toString());
        if (paymentById != null) {
            return new CommonResult(200, "查询成功", paymentById);
        } else {
            return new CommonResult(444, "查询失败，没有对应记录");
        }
    }
}
