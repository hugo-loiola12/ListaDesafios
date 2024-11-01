package br.com.polimorfismo.classes;

public abstract class Pessoa {

    private String nome;
    private float salarioBase;

    public float getSalario() {
        return salarioBase;
    }

    public void setSalario(float salario) {
        this.salarioBase = salario;
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
