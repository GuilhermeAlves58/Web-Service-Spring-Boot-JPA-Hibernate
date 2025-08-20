package com.springbootgm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgm.spring.entites.OrderItem;
import com.springbootgm.spring.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{
    
}
