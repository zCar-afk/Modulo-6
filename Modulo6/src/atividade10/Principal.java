package atividade10;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
    
        List<Transacao> transacoes = new ArrayList<>();

    
        transacoes.add(new CartaoDeCredito(150.00, "0000-1212-1111-2222"));
        transacoes.add(new Boleto(350.00, "123456789012345678901234567890"));

  
        for (Transacao transacao : transacoes) {
            transacao.executarTransacao();
            System.out.println();
        }
    }
}