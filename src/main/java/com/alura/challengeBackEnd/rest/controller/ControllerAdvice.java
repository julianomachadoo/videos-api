package com.alura.challengeBackEnd.rest.controller;

import com.alura.challengeBackEnd.exception.DataNotFoundException;
import com.alura.challengeBackEnd.rest.ApiErrors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ApiErrors handleDataNotFoundException (DataNotFoundException ex){
        return new ApiErrors(ex.getMessage());
    }
}
