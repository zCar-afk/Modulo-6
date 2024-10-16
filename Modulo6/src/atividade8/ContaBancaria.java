package atividade8;

public abstract class ContaBancaria {
	protected double saldo;

	public ContaBancaria() {
		this.saldo = 0.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void calcularRendimento();

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depositado: R$" + valor);
		System.out.println("O seu Novo Saldo é de: R$" + saldo);
	}
}