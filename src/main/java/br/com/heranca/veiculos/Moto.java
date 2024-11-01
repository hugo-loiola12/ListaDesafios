package br.com.heranca.veiculos;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super();
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int setCilindradas(int cilindradas) {
        return this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarInformacao() {
        super.mostrarInformacao();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
