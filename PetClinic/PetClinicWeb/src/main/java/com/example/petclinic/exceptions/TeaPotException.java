package com.example.petclinic.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class TeaPotException extends RuntimeException {
    public TeaPotException() {
        super();
    }

    public TeaPotException(String message) {
        super(message);
    }

    public TeaPotException(String message, Throwable cause) {
        super(message, cause);
    }
}
