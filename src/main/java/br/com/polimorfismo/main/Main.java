package br.com.polimorfismo.main;

import br.com.polimorfismo.classes.Diretor;
import br.com.polimorfismo.classes.Funcionario;
import br.com.polimorfismo.classes.Gerente;
import br.com.polimorfismo.folha.FolhaPagamento;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Hugo", 5005.65f);
        Gerente gerente = new Gerente("Juan", 11000.80f);
        Diretor diretor = new Diretor("Gustavo", 72000.70f);


        // Inicializar folha de pagamento
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.pagar(List.of(funcionario, gerente, diretor));

    }
}
