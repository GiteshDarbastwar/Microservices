package com.gtasterix.department_service.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IDNotFoundException extends RuntimeException {

    public IDNotFoundException(String message) {
        super(message);
    }
}
