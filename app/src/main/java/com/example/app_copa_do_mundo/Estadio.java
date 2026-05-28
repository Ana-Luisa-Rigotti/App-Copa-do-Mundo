package com.example.app_copa_do_mundo;

public class Estadio {

    private String nome;
    private String cidade;
    private int imagem;
    private String descricao;

    public Estadio(String nome, String cidade, int imagem, String descricao) {
        this.nome = nome;
        this.cidade = cidade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }
}