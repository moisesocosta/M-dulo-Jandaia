package com.monitoriafundamentosjava;

public class LivroFiccaoCientifica extends Livro
{
    private String subgenero;

    public LivroFiccaoCientifica(String titulo, String autor, String subgenero)
    {
        super(titulo, autor);
        this.subgenero = subgenero;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("\n Subgenero: " + this.subgenero);
    }
}
