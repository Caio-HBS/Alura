package org.example;

public class VarLocal {

    public VarLocal() {
    }

    private void m1() {
        // Essa é uma VARIÁVEL LOCAL, que pode ser acessada livremente dentro
        // desse bloco.
        int x = 10;

        if (x >= 10) {
            // Essa variável só será iniciada dentro desse bloco, que por sua
            // vez, só é executado caso uma outra condição seja satisfeita, a
            // variável y NÃO estará disponível fora desse bloco.
            int y = 50;

            System.out.println(y);
        }

        System.out.println(x);
    }

    public void m2(String nome) {
        // Mesmo esse parâmetro é uma variável local, não conseguiremos acessá-lo
        // de fora desse método, a variável "morrerá" após o método ser executado.
        System.out.println(nome);
    }

    public VarLocal(String nome) {
        // Mesmo dentro de um construtor, se tentarmos acessar a variável "nome",
        // não conseguiremos, pois ela morre após o construtor ser instanciado.
        System.out.println(nome);
    }

    public static void main(String[] args) {
        VarLocal t = new VarLocal();
        t.m1();
        t.m2("Caio");
    }

}
