package pessoa;

import carro.Carro;

public class Gol extends Carro {
    public Gol(String modelo, String cor, int ano, String placa) {
        super(modelo, cor, ano, placa);
        this.modelo = modelo;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

}
