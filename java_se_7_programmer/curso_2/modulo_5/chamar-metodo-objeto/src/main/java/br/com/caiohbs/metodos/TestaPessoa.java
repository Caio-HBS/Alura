package br.com.caiohbs.metodos;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // Assim como utilizamos o "." para acessar os campos de uma classe,
        // podemos fazer o mesmo para acessar os métodos dessa classe:
        p1.setNome("Caio");

        // Outro exemplo
        String nome = p1.getNome();
        System.out.println(nome);

    }
}