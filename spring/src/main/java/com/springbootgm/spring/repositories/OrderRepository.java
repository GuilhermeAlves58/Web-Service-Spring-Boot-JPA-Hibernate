package com.springbootgm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgm.spring.entites.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
    
}
