package br.com.caiohbs;

public class TestaCarro {

    public static void main(String[] args) {
        Carro a = new Carro();

        // Podemos definir o campo diretamente (apesar de não ser recomendado):
        a.ano = 2004;

        // Ou por meio do setter:
        a.setModelo("Palio");

        System.out.println("Resultado da consulta por carro:\n" + a.getDadosDeImpressao());
    }

}
