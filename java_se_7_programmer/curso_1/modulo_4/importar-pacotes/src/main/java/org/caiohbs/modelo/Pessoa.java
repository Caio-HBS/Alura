package org.caiohbs.modelo;

// Uma classe sem modificador de acesso será acessível APENAS para classes no mesmo
// pacote. Sendo assim, caso queiramos acessá-la de outro pacote, precisamos que
// o modificador de acesso seja "public":
public class Pessoa {

    String nome;
    // Uma vez que a classe Endereco está dentro do mesmo pacote que Pessoa, o
    // Java permite que eu use o nome simples para referenciá-la pois a acha
    // automaticamente sem a necessidade de um import:
    Endereco endereco;

}
