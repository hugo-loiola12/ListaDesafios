package br.com.contrato.formas;

import br.com.contrato.area.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        super();
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
