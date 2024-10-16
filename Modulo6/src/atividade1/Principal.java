package atividade1;

public class Principal {
	public static void main(String[] args) {
		SomDosAnimais somDosAnimais = new SomDosAnimais();

		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		Animal pato = new Pato();

		System.out.println("Cachorro: " + somDosAnimais.emitirSom(cachorro));
		System.out.println("Gato: " + somDosAnimais.emitirSom(gato));
		System.out.println("Pato: " + somDosAnimais.emitirSom(pato));
	}
}
