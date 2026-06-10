package com.example.app_copa_do_mundo;

public class Selecao {

    private String nome;
    private String continente;
    private String descricao;
    private int imagem;

    public Selecao(String nome, String continente, String descricao, int imagem) {
        this.nome = nome;
        this.continente = continente;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImagem() {
        return imagem;
    }

}
