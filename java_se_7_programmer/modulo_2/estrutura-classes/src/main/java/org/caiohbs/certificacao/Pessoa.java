// O primeiro elementos que podemos ter num arquivo/classe Java é a marcação de
// um pacote, o que é opcional. Caso marcado, deve SEMPRE ser a primeira
// informação do arquivo:
package org.caiohbs.certificacao;

// Além disso, podemos também ter os imports de outras classes que podem ser
// úteis para essa classe:

import java.util.Date;
import java.io.*;


// Após package e imports, temos finalmente a classe em si; sendo que, caso a
// classe seja pública, ela deve ter o mesmo nome que o arquivo e não podemos
// nunca ter mais de um tipo público por arquivo:
public class Pessoa {
    // Classes podem ter variáveis:
    static int totalPessoas = 0;
    String nome;

    // Construtores:
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // E métodos:
    public String getNome() {
        String sobrenome = " Bianchi";
        return nome + sobrenome;
    }
}

// Por fim, temos as interfaces e outros tipos. Em Java, podemos ter de 0 a
// infinitas classes num mesmo arquivo (apesar de ser aconselhável manter uma
// maior separação):
interface Figura {

    // Interfaces podem ter variáveis e métodos, sendo que ambas SEMPRE serão
    // públicas por padrão; além disso, variáveis sempre serão na verdade
    // constantes (finais),  métodos sempre serão abstratos:
    public static final int TAMANHO = 5;

    public abstract void autentica(String nome, String senha);

}
