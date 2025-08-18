package com.springbootgm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgm.spring.entites.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
    
}
