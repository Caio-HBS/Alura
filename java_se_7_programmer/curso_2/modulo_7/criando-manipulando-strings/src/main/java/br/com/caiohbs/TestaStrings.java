package br.com.caiohbs;

public class TestaStrings {

    public static void main(String[] args) {
        // Existem algumas formas de se criar uma string em Java, a mais comum:
        String nomeDireto = "Java";

        // E a forma menos comum, mas também aceitável, que usa o construtor:
        String nomeIndireto = new String("Java");

        // A forma usando um array de chars para criar uma string:
        char[] nomeEmChars = new char[]{'J', 'a', 'v', 'a'};
        String nome = new String(nomeEmChars);

        // A forma usando um string builder/buffer
        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String(sb1);


        // Strings também podem receber um valor nulo:
        String valorNulo = null;


        // Uma propriedade importantíssma das strings é o fato de serem imutáveis.
        // Nesse caso, apesar de chamarmos .toUpperCase(), o console terá a
        // palavra minúscula:
        String exemplo = "minúscula";
        exemplo.toUpperCase(); // Cria um novo objeto SEM REFERÊNCIA na memória.
        System.out.println(exemplo);
    }

}