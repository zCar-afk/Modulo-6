package atividade7;

public class Principal {
	public static void usarFerramentas(Ferramenta[] ferramentas) {
		for (Ferramenta ferramenta : ferramentas) {
			ferramenta.usar();
			ferramenta.manter();
		}
	}

	public static void main(String[] args) {

		Ferramenta[] ferramentas = { new Martelo(), new Serra(), new ChaveDeFenda() };

		usarFerramentas(ferramentas);
	}
}
