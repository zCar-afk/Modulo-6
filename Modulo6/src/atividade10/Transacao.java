package atividade10;

public abstract class Transacao implements MeioDePagamento {
	protected double valor;

	public Transacao(double valor) {
		this.valor = valor;
	}

	public abstract void executarTransacao();

}
