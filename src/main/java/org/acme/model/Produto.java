package org.acme.model;

public class Produto {
    public Integer id;
    public String nome;
    public String fabricante;

    public Produto(Integer id, String nome, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }
}
