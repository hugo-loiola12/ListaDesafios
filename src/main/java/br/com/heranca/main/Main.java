package br.com.heranca.main;

import br.com.heranca.veiculos.Caminhao;
import br.com.heranca.veiculos.Carro;
import br.com.heranca.veiculos.Moto;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Volvo", "XC30", 2023, 5, 420);
        System.out.println("Carro");
        carro.mostrarInformacao();
        System.out.println("---------------------");
        Moto moto = new Moto("Kawasaki", "Z650RS", 2024, 649);
        System.out.println("Moto");
        moto.mostrarInformacao();
        System.out.println("---------------------");
        Caminhao caminhao = new Caminhao("Mercedez-Benz", "AX500", 2020, 10000, 3);
        System.out.println("Caminhão");
        caminhao.mostrarInformacao();
    }
}
