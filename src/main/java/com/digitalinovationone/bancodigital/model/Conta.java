package com.digitalinovationone.bancodigital.model;

import interfaces.IConta;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if(valor>saldo) throw new RuntimeException("Saldo insuficiente para realizar a operação");
            else saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, IConta destino) {
        sacar(valor);
        destino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns()
    {
        System.out.printf("Titular: %s%n",cliente.getNome());
        System.out.printf("Agencia: %d%n",agencia);
        System.out.printf("Conta: %d%n",numero);
        System.out.printf("Saldo: R$%.2f%n",saldo);
    }
}
