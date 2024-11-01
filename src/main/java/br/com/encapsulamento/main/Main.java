package br.com.encapsulamento.main;

import br.com.encapsulamento.conta.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Hugo Loiola de Queiroz", 50.65);

        System.out.println(conta.getSaldo());

        conta.sacar(5);

        conta.depositar(50.56);

        conta.setTitular("Hugo Loiola");
    }
}
