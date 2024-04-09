package org.example.VarStatic;

public class Static {

    // Variáveis estáticas podem ser acessadas dentro de qualquer escopo, seja
    // dentro de um construtor ou de métodos locais.
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        // É possível acessar uma variável estática/de classe por meio da
        // instância:
        System.out.println("Variável acessada através da instância: " + p.id);

        // Ou mesmo através da própria classe:
        System.out.println("Variável acessada através da classe: " + Pessoa.id);

        // Finalmente, podemos também acessar variáveis estáticas através de
        // métodos estáticos:
        Pessoa.metodo();

    }

}
