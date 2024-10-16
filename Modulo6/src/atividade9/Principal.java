package atividade9;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		List<Eletronico> dispositivos = new ArrayList<>();

		dispositivos.add(new Celular("Nokia", "Tijolão"));
		dispositivos.add(new Tablet("Samsumg", "ultra"));

		for (Eletronico dispositivo : dispositivos) {
			dispositivo.ligar();
			dispositivo.desligar();
		}
	}
}
