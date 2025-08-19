package com.springbootgm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgm.spring.entites.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
    
}
