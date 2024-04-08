package org.example;

public class VarInstance {

    // Variáveis de instância são aquelas que são declaradas dentro da classe:
    String variavel = "x";
    // Também podemos referenciar variáveis de instância em outras variáveis de
    // instância:
    String variavelComposta = variavel + " y";

    public VarInstance() {
        // Esse tipo de variável permite que ela seja acessade dentro de todos os
        // métodos do objeto, incluindo o meu construtor, mas NUNCA em métodos
        // estáticos.
        System.out.println("Essa variável foi acessada de dentro do construtor: " + variavel);
    }

    public void m1() {
        System.out.println("Essa variável está sendo acessada de dentro de um método: " + variavel);
    }

    public void m2() {
        System.out.println("Essa variável faz referencia a outra variável: " + variavelComposta);
    }

    public static void main(String[] args) {
        VarInstance v = new VarInstance();
        v.m1();
        v.m2();

        // Também é possível acessar a variável por meio da própria instância:
        v.variavel = "l";
        System.out.println("O valor dessa variável foi modificado pela instância: " + v.variavel);
    }

}
