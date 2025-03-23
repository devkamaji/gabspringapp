package br.gabspringapp.controller;

import br.com.gabspring.annotations.*;
import br.gabspringapp.model.Produto;
import br.gabspringapp.service.IServiceExample;

@GabController
public class TestController {

    @GabInjected
    private IServiceExample serviceExample;

    @GabGetMethod(path = "/test")
    public String test() {
        return "Hello, World!";
    }

    @GabGetMethod(path = "/produto")
    public Produto exibirProduto() {
        return new Produto(1L, "Produto 1", "Descrição do Produto 1");
    }

    @GabPostMethod(path = "/produto")
    public String cadastrarProduto(@GabBody Produto produto) {
        System.out.println(produto);
        return "Produto cadastrado!";
    }

    @GabGetMethod(path = "/service")
    public String getServiceMessage() {
        return serviceExample.getMessage();
    }
}
