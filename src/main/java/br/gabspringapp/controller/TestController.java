package br.gabspringapp.controller;

import br.com.gabspring.annotations.GabController;
import br.com.gabspring.annotations.GabGetMethod;

@GabController
public class TestController {

    @GabGetMethod(path = "/test")
    public String test() {
        return "Hello, World!";
    }
}
