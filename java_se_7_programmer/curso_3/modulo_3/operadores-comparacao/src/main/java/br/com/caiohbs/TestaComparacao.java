package br.com.caiohbs;

public class TestaComparacao {

    public static void main(String[] args) {
        // Operadore de comparação clássicos:
        System.out.println(1 == 1); // Operador de igualdade.
        System.out.println(1 != 1); // Operador de diferença.

        System.out.println(1 > 1); // Operador de maior.
        System.out.println(1 < 1); // Opedador de menor.
        System.out.println(1 >= 1); // Operador de maior/igual;
        System.out.println(1 >= 1); // Operador de menor/igual

        // É importante lembrarmos que uma comparação não leva em cosideração o
        // tipo dos dados que estamos comparando (falando de tipos primitivos
        // numéricos especificamente):
        System.out.println(1 == 1.0);
        System.out.println(1.0f == 1.0d);
    }

}