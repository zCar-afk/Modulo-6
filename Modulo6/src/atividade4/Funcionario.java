package atividade4;

public abstract class Funcionario {
	public String nome;
	public double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public abstract double calcularBonus();
}
