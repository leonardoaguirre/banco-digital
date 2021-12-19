package main;

import com.digitalinovationone.bancodigital.model.Cliente;
import com.digitalinovationone.bancodigital.model.Conta;
import com.digitalinovationone.bancodigital.model.ContaCorrente;
import com.digitalinovationone.bancodigital.model.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Leonardo");

        Conta cc= new ContaCorrente(cli);
        Conta cp= new ContaPoupanca(cli);

        cc.depositar(100);
        cc.transferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
