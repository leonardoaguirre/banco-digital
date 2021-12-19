package main;

import com.digitalinovationone.bancodigital.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Leonardo");
        Cliente cli2 = new Cliente("Sergio");
        Cliente cli3 = new Cliente("Renan");

        Conta cc= new ContaCorrente(cli);
        Conta cp= new ContaPoupanca(cli);

        cc.depositar(100);
        cc.transferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cli);
        clienteList.add(cli2);
        clienteList.add(cli3);
        Banco banco = new Banco("Nubank",clienteList);
        banco.listarClientes();
    }
}
