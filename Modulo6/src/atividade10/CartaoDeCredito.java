package atividade10;

public class CartaoDeCredito extends Transacao {
	private String numeroCartao;

	public CartaoDeCredito(double valor, String numeroCartao) {
		super(valor);
		this.numeroCartao = numeroCartao;
	}

	public void pagar() {
		System.out.println("Pagando R$" + valor + " com cartão de crédito número " + numeroCartao);
	}

	public void executarTransacao() {
		System.out.println("Transação com cartão de crédito em andamento...");
		pagar();
		System.out.println("Transação com cartão de crédito concluída.");
	}

}
