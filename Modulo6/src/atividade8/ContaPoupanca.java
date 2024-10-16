package atividade8;

public class ContaPoupanca extends ContaBancaria {

	public void calcularRendimento() {
		double rendimento = saldo * 0.01;
		saldo += rendimento;
		System.out.println("Rendimento da conta poupança: R$" + rendimento);
		System.out.println("Novo saldo após rendimento: R$" + saldo);
	}
}