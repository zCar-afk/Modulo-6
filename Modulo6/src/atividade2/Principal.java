package atividade2;

public class Principal {
	public static void main(String[] args) {

		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();

		Garagem garagem = new Garagem();

		System.out.println("Carro:");
		garagem.adicionarTransporte(carro);

		System.out.println("\nBicicleta:");
		garagem.adicionarTransporte(bicicleta);
	}
}
