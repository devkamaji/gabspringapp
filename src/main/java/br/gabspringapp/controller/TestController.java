package br.gabspringapp.controller;

import br.com.gabspring.annotations.GabBody;
import br.com.gabspring.annotations.GabController;
import br.com.gabspring.annotations.GabGetMethod;
import br.com.gabspring.annotations.GabPostMethod;
import br.gabspringapp.model.Produto;

@GabController
public class TestController {

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
}
