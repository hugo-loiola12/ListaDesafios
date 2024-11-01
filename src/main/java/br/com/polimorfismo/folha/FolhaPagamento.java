package br.com.polimorfismo.folha;

import br.com.polimorfismo.classes.Pessoa;

import java.util.List;

public class FolhaPagamento {
    // Recebe uma lista de funcionarios com o tipo da classe pai
    public void pagar(List<Pessoa> funcionarios) {
        // Faz um loop percorrendo esta lista
        for (Pessoa funcionario : funcionarios) {
            System.out.printf("Salário de %s: R$%.2f%n", funcionario.getNome(), funcionario.calculaSalario());
        }
        System.out.println("Pagamento efetuado com sucesso!");
    }
}
