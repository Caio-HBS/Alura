package br.com.caiohbs;

class MeuObjeto {

    int valor;

}

public class TesteReferencia {

    public static void main(String[] args) {

        // Apesar de ambas as variáveis terem o valor "10", o Java não aponta para
        // o mesmo 10:
        int a = 10;
        System.out.println("O valor inicial de 'a' é: " + a);

        // O que fazemos na linha seguinte, como se trata de tipos primitivos, é
        // apenas COPIAR o valor de um para o outro:
        int b = a;

        a += 5;

        System.out.println("O valor de 'a' agora é: " + a);
        System.out.println("O valor de 'b' é: " + b);


        // Trabalhando agora com objetos, temos que:
        MeuObjeto meuObjeto1 = new MeuObjeto();
        meuObjeto1.valor = 10;
        System.out.println("\nObjeto criado de valor: " + meuObjeto1.valor);

        // O que fazemos na linha seguinte é apenas criar uma REFERÊNCIA ao objeto,
        // o que fica claro quando reparamos que não estamos chamando o construtor
        // para criar o segundo objeto.
        MeuObjeto meuObjeto2 = meuObjeto1;

        // Como trata-se de uma referência, a linha seguinte causará uma mudança
        // nos dois objetos:
        meuObjeto1.valor += 5;

        System.out.println("Valor do primeiro objeto: " + meuObjeto1.valor);
        System.out.println("Valor do segundo objeto: " + meuObjeto2.valor);

    }

}