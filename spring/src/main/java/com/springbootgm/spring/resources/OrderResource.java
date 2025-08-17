package com.springbootgm.spring.resources; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootgm.spring.entites.User;
import com.springbootgm.spring.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResource{
    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable long id){
        User obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}