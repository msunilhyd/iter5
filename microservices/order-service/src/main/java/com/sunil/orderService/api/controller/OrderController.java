package com.sunil.orderService.api.controller;

import com.sunil.orderService.api.common.Payment;
import com.sunil.orderService.api.common.TransactionRequest;
import com.sunil.orderService.api.common.TransactionResponse;
import com.sunil.orderService.api.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sunil.orderService.api.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest tRequest){
        return orderService.saveOrder(tRequest);
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello";
    }
}
