package com.springbootgm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgm.spring.entites.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
    
}
