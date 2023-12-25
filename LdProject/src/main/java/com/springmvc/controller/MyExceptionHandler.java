package com.springmvc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.FileNotFoundException;

@ControllerAdvice
public class MyExceptionHandler {

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = NullPointerException.class)
    public String nullExceptionHandler(Model m) {
        m.addAttribute("msg", "null pointer exception occurred.");
        return "error_page";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NumberFormatException.class)
    public String numberFormatExceptionHandler(Model m) {
        m.addAttribute("msg", "number format exception occurred.");
        return "error_page";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = FileNotFoundException.class)
    public String fileNotFoundException(Model m) {
        m.addAttribute("msg", "file not found on server.");
        return "error_page";
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public String generalException(Model m) {
        m.addAttribute("msg", "bad request.");
        return "error_page";
    }

}
