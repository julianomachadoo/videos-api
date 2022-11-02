package com.alura.challengeBackEnd.exception;

public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException (String message) {
        super(message);
    }
}
