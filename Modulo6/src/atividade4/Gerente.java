package atividade4;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public double calcularBonus() {
		return this.salario * 0.20;

	}
}
