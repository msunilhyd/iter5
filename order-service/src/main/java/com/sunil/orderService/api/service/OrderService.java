package com.sunil.orderService.api.service;

import com.sunil.orderService.api.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunil.orderService.api.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order){
        return repository.save(order);
    }
}
