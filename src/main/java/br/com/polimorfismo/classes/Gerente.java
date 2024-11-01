package br.com.polimorfismo.classes;

public class Gerente extends Pessoa {


    public Gerente(String nome, float salario) {
        super();
        setNome(nome);
        setSalario(salario);
    }

    @Override
    public float calculaSalario() {
        return (getSalario() * 1.5f);
    }
}
