package br.com.polimorfismo.classes;

public class Diretor extends Pessoa {

    public Diretor(String nome, float salario) {
        super();
        setNome(nome);
        setSalario(salario);
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario();
    }
}
