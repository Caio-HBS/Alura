package br.com.caiohbs;

class Calculadora {

    // Podemos usar varArgs para recebermos os números como arrays diretamente,
    // isso permite que deixemos o código mais limpo:
    public int soma(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }

        return soma;
    }

}

public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        // Sendo assim, podemos chamar o mesmo método com diversos números para
        // testar:
        System.out.println("O resultado da soma é: " + c.soma(3, 5));
        System.out.println("O resultado da soma é: " + c.soma(3, 5, 10));
        System.out.println(
                "O resultado da soma é: " + c.soma(3, 5, 10, 113)
        );
        System.out.println(
                "O resultado da soma é: " + c.soma(3, 5, 1, 2, 3, 4, 5, 8)
        );
        System.out.println(
                "O resultado da soma é: " + c.soma(3, 5, 1161, 123)
        );
        System.out.println("O resultado da soma é: " + c.soma(3));
        System.out.println("O resultado da soma é: " + c.soma());
    }

}
