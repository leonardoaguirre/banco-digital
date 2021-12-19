package com.digitalinovationone.bancodigital.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome, List<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public void listarClientes(){
        System.out.println("::::::Lista de clientes:::::");
        System.out.printf("Banco: %s%n",nome);
        System.out.println("Clientes:");
        for (Cliente cli:
             clientes) {
            System.out.printf("%s%n",cli.getNome());
        }
    }
}
