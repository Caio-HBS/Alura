package br.com.caiohbs;

import java.util.ArrayList;
import java.util.List;

public class TestaOperadores {

    public static void main(String[] args) {
        int idade = 15; // Típica expressão de atribuição de valor.

        // O Java permite que tipos mais específicos sejam colocados em tipos
        // mais abrangentes, poe exemplo:
        long idade2 = 15; // 15 é um int, mas é possível atribui-lo a um long.
        // A ordem dos tipos mais primitivos para os menos é a seguinte:
        // byte -> short -> int -> long
        // float -> double

        // O mesmo vale quando trabalhamos com referências a objetos:
        ArrayList<String> lista = new ArrayList<>();
        List<String> lista2 = lista; // List é mais abrangente, enquanto ArrayList
                                     // é mais específico.
    }

}