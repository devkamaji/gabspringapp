package br.gabspringapp.model;

public record Produto(
        Long id,
        String nome,
        String descricao
) {}