package br.com.caiohbs;

public class TestaAritmetica {

    public static void main(String[] args) {
        int dois = 2;
        int cinco = 5;
        int dez = 10;
        long cem = 100;

        // Operadores aritméticos tradicionais:
        int soma = dez + dois;
        int subtracao = dez - dois;
        int multiplicacao = dez * dois;
        int divisao = dez / dois;
        // Operador de resto:
        int resto = cinco % dois;

        // Em Java, o resultado de QUALQUER operação aritmética é, NO MÍNIMO, um
        // int, nada abaixo disso. Trabalhando com dois tipos diferentes, o
        // resultado é sempre o maior entre os dois envolvidos:
        long novoLong = cem / dois; // A conta sempre retornará um long.

        // Curiosamente, é possível dividir números por zero em Java contanto que
        // hajam números reais envolvidos:
        double divisaoPorZero = 100 / 0.0;
        System.out.println(divisaoPorZero);
    }

}