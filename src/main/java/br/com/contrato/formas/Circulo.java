package br.com.contrato.formas;

import br.com.contrato.area.AreaCalculavel;

public class Circulo implements AreaCalculavel {

    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

