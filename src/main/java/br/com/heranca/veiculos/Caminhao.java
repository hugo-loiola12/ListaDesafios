package br.com.heranca.veiculos;

public class Caminhao extends Veiculo {

    private float carga;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, float carga, int numeroEixos) {
        super();
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.carga = carga;
        this.numeroEixos = numeroEixos;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}
