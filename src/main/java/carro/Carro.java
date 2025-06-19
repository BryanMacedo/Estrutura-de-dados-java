package carro;

import pintura.Pintavel;

public class Carro implements Pintavel {
    protected String modelo;
    String cor;
    int ano;
    String placa;

    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }

    protected void Test() { //visível apenas no mesmo pacote
        System.out.println("Test");
    }

    @Override
    public void aplicarTinta() {

    }
}
