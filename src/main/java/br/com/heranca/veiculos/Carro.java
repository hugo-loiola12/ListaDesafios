package br.com.heranca.veiculos;

public class Carro extends Veiculo {

    private int quantidadePortas;
    private float tamanhoPortaMalas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas, float tamanhoPortaMalas) {
        super();
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.quantidadePortas = quantidadePortas;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public float getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(float tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    @Override
    public void mostrarInformacao() {
        super.mostrarInformacao();
        System.out.println("Quantidade de portas: " + getQuantidadePortas());
        System.out.println("Tamanho do porta malas: " + getTamanhoPortaMalas() + "l");
    }
}
