package br.com.caiohbs;

class Motor {
}

class Carro {

    // Variáveis membro possuem valor padrão. Sendo assim, não precisam de um valor
    // inicial explícito, pois recebem um ao serem inicializadas. O mesmo não vale
    // para variáveis locais, no entanto.
    int ano;
    char primeiraLetra;
    boolean usado;
    String modelo;
    Motor motor;

}

public class Teste {

    public static void main(String[] args) {

        int[] valores = new int[10];
        System.out.println("O valor padrão é do array de dez lugares é: " + valores[0]);

        // Por ser uma linguagem fortemente tipada, todas as variáveis em Java
        // precisam ter um tipo (que pode ser implícito se utilizarmos "var"):
        int idade;
        // Tipo implícito:
        var altura = 1.76;

        Carro carro = new Carro();
        System.out.println("O valor inicial da variável membro 'ano' é: " + carro.ano);
        System.out.println("O valor inicial da variável membro 'primeiraLetra' é: " + carro.primeiraLetra);
        System.out.println("O valor inicial da variável membro 'usado' é: " + carro.usado);
        System.out.println("O valor inicial da variável membro 'modelo' é: " + carro.modelo);
        System.out.println("O valor inicial da variável membro 'Motor' é: " + carro.motor);

    }

}