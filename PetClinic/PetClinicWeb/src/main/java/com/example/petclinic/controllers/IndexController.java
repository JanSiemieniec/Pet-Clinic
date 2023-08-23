package com.example.petclinic.controllers;

import com.example.petclinic.exceptions.TeaPotException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "index.html"})
    public String index() {
        return "index";
    }

    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @ExceptionHandler(TeaPotException.class)
    @RequestMapping({"/oups"})
    public String oupsHandler() {
        throw new TeaPotException(
                "Expected: controller used to showcase what happens when an exception is thrown");
    }
}
