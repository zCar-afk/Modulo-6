package atividade9;

public class Tablet extends Dispositivo {
	public Tablet(String marca, String modelo) {
		super(marca, modelo);
	}

	public void ligar() {
		System.out.println("Ligando o tablet " + marca + " " + modelo);
	}

	public void desligar() {
		System.out.println("Desligando o tablet " + marca + " " + modelo);
	}
}
