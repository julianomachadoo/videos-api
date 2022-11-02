package com.alura.challengeBackEnd.rest;

import java.util.Collections;
import java.util.List;

public class ApiErrors {

    private List<String> errors;

    public ApiErrors(List<String> errors) {
        this.errors = errors;
    }

    public ApiErrors(String mensagemErro) {
        this.errors = Collections.singletonList(mensagemErro);
    }

    public List<String> getErrors() {
        return errors;
    }
}
