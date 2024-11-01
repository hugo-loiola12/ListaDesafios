package br.com.polimorfismo.classes;

public class Funcionario extends Pessoa {


    public Funcionario(String nome, float salario) {
        super();
        setNome(nome);
        setSalario(salario);
    }

    @Override
    public float calculaSalario() {
        return (getSalario() * 1.2f);
    }
}
