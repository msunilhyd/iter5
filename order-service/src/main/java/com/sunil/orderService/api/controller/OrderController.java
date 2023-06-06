package com.sunil.orderService.api.controller;

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
    public Order bookOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello";
    }
}
