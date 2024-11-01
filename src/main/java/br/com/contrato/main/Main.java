package br.com.contrato.main;

import br.com.contrato.area.AreaCalculavel;
import br.com.contrato.formas.Circulo;
import br.com.contrato.formas.Retangulo;
import br.com.contrato.formas.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instanciar com o tipo da inteface
        AreaCalculavel ciruculo = new Circulo(3);
        AreaCalculavel retangulo = new Retangulo(8, 6);
        AreaCalculavel triangulo = new Triangulo(5.5, 8);
        // Fazer uma lista com o tipo da interface
        List<AreaCalculavel> areas = new ArrayList<>();
        // Adicionar os objetos
        areas.add(ciruculo);
        areas.add(retangulo);
        areas.add(triangulo);
        // Fazer um loop mostrando todos os calculos
        areas.forEach(area -> System.out.println(area.calcularArea()));
    }
}
