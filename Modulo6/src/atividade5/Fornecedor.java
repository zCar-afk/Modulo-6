package atividade5;

public class Fornecedor extends Pessoa implements Pagavel {
	private double valorContrato;

	public Fornecedor(String nome, String documento, double valorContrato) {
		super(nome, documento);
		this.valorContrato = valorContrato;
	}

	public double calcularPagamento() {
		return valorContrato;
	}
}