package com.monitoriafundamentosjava;
public class Livro {

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void exibirDetalhes()
    {
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }


}
