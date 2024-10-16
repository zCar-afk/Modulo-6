package atividade5;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Pagavel empregado = new Empregado("João", "Rg: 18401231", 4000.0);
		Pagavel fornecedor = new Fornecedor("StarLink", "Rg: 987654321", 15000.0);

		List<Pagavel> listaPagaveis = new ArrayList<>();
		listaPagaveis.add(empregado);
		listaPagaveis.add(fornecedor);

		for (Pagavel pagavel : listaPagaveis) {
			System.out.println("Pagamento: " + pagavel.calcularPagamento());

		}
	}
}
