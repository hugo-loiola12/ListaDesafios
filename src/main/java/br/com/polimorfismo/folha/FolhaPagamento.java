package br.com.polimorfismo.folha;

import br.com.polimorfismo.classes.Pessoa;

import java.util.List;

public class FolhaPagamento {
    public void pagar(List<Pessoa> funcionarios) {

        for (Pessoa funcionario : funcionarios) {
            System.out.println("Salário de " + funcionario.getNome() + ": " + funcionario.calculaSalario());
        }
        System.out.println("Pagamento efetuado com sucesso!");
    }
}
