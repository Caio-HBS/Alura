package br.com.caiohbs;

public class Carro {

    String modelo;
    int ano;

    public Carro() {
    }

    Carro(String modelo, int ano) {
        // Por estarmos dentro do construtor e não termos nenhuma outra variável
        // com o mesmo nome, o uso de "this." é opcional:
        modelo = modelo;
        ano = ano;
    }

    public String getDadosDeImpressao() {
        return modelo + " :: " + ano;
    }

    public void setModelo(String m) {
        // Nesse caso, se mudássemos o nome da variável local para "modelo", aí
        // sim o "this." se faria útil:
        this.modelo = m;
    }

}