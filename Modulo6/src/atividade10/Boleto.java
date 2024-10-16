package atividade10;

public class Boleto extends Transacao {
	private String codigoBarras;

	public Boleto(double valor, String codigoBarras) {
		super(valor);
		this.codigoBarras = codigoBarras;
	}

	public void pagar() {
		System.out.println("Pagando R$" + valor + " com boleto código de barras " + codigoBarras);
	}

	public void executarTransacao() {
		System.out.println("Transação com boleto em andamento...");
		pagar();
		System.out.println("Transação com boleto concluída.");
	}
}