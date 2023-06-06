package com.sunil.orderService.api.repository;

import com.sunil.orderService.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
