package atividade4;

public class Analista extends Funcionario {

	public Analista(String nome, double salario) {
		super(nome, salario);
	}

	public double calcularBonus() {
		return this.salario * 0.10;
	}
}