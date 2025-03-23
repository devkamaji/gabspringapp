package br.gabspringapp.service;

import br.com.gabspring.annotations.GabService;

@GabService
public class ServiceExample implements IServiceExample{

    @Override
    public String getMessage() {
        return "Hello from ServiceExample!";
    }
}
