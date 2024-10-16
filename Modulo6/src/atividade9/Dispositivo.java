package atividade9;

public abstract class Dispositivo implements Eletronico {
	protected String marca;
	protected String modelo;

	public Dispositivo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
}
