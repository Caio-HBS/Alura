package br.com.caiohbs;

public class Carro {

    private String modelo;
    private int ano;

    public Carro() {
    }

    public Carro(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return modelo + " :: " + ano;
    }

}
