package br.com.polimorfismo.classes;

public abstract class Pessoa {

    private String nome;
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calculaSalario() {
        return getSalario();
    }
}
