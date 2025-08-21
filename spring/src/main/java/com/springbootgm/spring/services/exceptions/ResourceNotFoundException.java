package com.springbootgm.spring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final Long serialVersionUID = 1L;
    
    public ResourceNotFoundException(Object id){
        super("Resource not Found. id "+ id);
    }


}
