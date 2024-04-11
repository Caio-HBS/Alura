package br.com.caiohbs;

public class TestaCicloDeVida {

    public static void main(String[] args) {

        // Um objeto é criado SOMENTE quando chamamos o construtor, como fazemos
        // a seguir:
        Carro carro  = new Carro();

        // Só podemos acessar o carro criado pois adicionamos uma referência a
        // ele em forma da variável "carro" quando em sua criação:
        carro.setAno(2014);
        carro.setModelo("Ferrari");
        System.out.println("Carro criado:\n" + carro);

        // Se criarmos um novo carro e darmos a ele uma referência igual a do
        // primeiro, o sistema de garbage collector será o único que terá acesso
        // ao primeiro, visto que a referência mudou de um para outro. Portanto,
        // o Java automaticamente vai tirar o primeiro carro da memória.
        carro = new Carro();
        System.out.println("\nCarro após mudarmos a referência ao objeto:\n" + carro);

        if (15 > 10) {
            // Como a seguinte variável é criada dentro de um bloco if, ela NÃO
            // poderá ser acessada fora desse bloco, o mesmo vale para loops:
            Carro carro2 = new Carro();
            carro2.setAno(2015);
        }

        Carro carro3;
        // No entanto, se criarmos um objeto fora de um bloco, ele existirá fora
        // do bloco após o seu término:
        for (int i=0;i < 10; i++) {
            carro3 = new Carro();
        }

    }

}
