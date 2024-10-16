package atividade4;

public class Principal {
	public static void main(String[] args) {

		Funcionario gerente = new Gerente("Magnus", 5000);
		Funcionario analista = new Analista("Nakamura", 3000);
		System.out.println("Bônus do Gerente " + gerente.nome + "\n" + gerente.calcularBonus());
		System.out.println("Bônus do Analista " + analista.nome + "\n" + analista.calcularBonus());
	}
}
