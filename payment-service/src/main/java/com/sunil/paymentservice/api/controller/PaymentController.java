package com.sunil.paymentservice.api.controller;

import com.sunil.paymentservice.api.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sunil.paymentservice.api.service.PaymentService;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.doPayment(payment);
    }

    public String paymentProcessing() {
        // api should be 3rd party payment gateway (paypal, paytm)
        return new Random().nextBoolean() ? "success": "boolean";
    }
}
