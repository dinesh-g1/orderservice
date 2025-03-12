package com.dinesh.ms.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.ms.orderservice.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
