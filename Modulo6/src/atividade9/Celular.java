package atividade9;

public class Celular extends Dispositivo {
	public Celular(String marca, String modelo) {
		super(marca, modelo);
	}

	public void ligar() {
		System.out.println("Ligando o celular " + marca + " " + modelo);
	}

	public void desligar() {
		System.out.println("Desligando o celular " + marca + " " + modelo);
	}
}