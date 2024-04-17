package br.com.caiohbs;

public class TestaLogicos {

    public static void main(String[] args) {
        // Em Java, "&" ou "&&" têm o mesmo efeito, que é o de operador lógico
        // "e":
        System.out.println(1 == 1 & 1 > 2);

        // Um outro operador similar, "ou", em Java é escrito usando um ou dois
        // pipes "||":
        System.out.println(1 == 1 || 1 > 2);

        // Outro operador lógico é o chamado "ou exclusivo", representado por
        // "^":
        System.out.println(1 == 1 ^ 1 > 2);

        // Além disso, temos também a negação de uma expressão, representada por
        // "!" logo antes da expressão:
        System.out.println(!(1 == 1)); // false
    }

}
