package com.digitalinovationone.bancodigital.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("::::Extrato conta corrente::::");
       super.imprimirInfosComuns();
    }
}
