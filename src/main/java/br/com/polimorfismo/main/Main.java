package br.com.polimorfismo.main;

import br.com.polimorfismo.classes.Diretor;
import br.com.polimorfismo.classes.Funcionario;
import br.com.polimorfismo.classes.Gerente;
import br.com.polimorfismo.folha.FolhaPagamento;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ Polimorfismo -----------");

        Funcionario funcionario = new Funcionario("Hugo", 2545.65f);
        Gerente gerente = new Gerente("Juan", 11000.65f);
        Diretor diretor = new Diretor("Gustavo", 50000.0f);


        // Inicializar folha de pagamento
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.pagar(List.of(funcionario, gerente, diretor));

    }
}
