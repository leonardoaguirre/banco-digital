package com.digitalinovationone.bancodigital.model;

import interfaces.IConta;

public class ContaCorrente implements IConta {

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }

    @Override
    public double transferir(double valor, IConta destino) {
        return 0;
    }
}
