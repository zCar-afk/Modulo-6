package atividade8;

public class Principal {
	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca();
		System.out.println("Conta poupança: ");
		poupanca.depositar(3000.0);
		poupanca.calcularRendimento();

		ContaCorrente corrente = new ContaCorrente();
		System.out.println("\nConta Corrente: ");
		corrente.depositar(2000.0);
		corrente.calcularRendimento();
	}
}
