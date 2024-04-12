package br.com.caiohbs;

public class TestaStringBuilder {

    public static void main(String[] args) {
        // Um string buffer nada mais é do que um espaço na memória que será
        // destinado a uma string:
        StringBuilder sb = new StringBuilder("Inicial");

        System.out.println("Valor inicial do SB: '" + sb + "'");

        // Podemos usar o método "append" para ir adicionando elementos à string:
        sb.append(" - final");

        System.out.println("Valor do SB após .append(): '" + sb + "'");


        // Podemos também criar um SB com um tamanho fixo inicial:
        StringBuilder sb2 = new StringBuilder(50);
        System.out.println("\nValor inicial do SB de capacidade 50: " + sb2);


        // Além disso, podemos criar um novo buffer baseado num buffer existente:
        StringBuilder sb3 = new StringBuilder(sb);
        System.out.println("\nValor inicial do SB3: '" + sb3 + "'");
        sb3.append(" (informação adicional do terceiro buffer)");
        System.out.println("Valor final do SB3: '" + sb3 + "'");

    }

}