package pacote2;

public class Carro {
    protected int litrosNoTanque;
    protected boolean carroLigado;

    public int getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public void setLitrosNoTanque(int litrosNoTanque) {
        this.litrosNoTanque = litrosNoTanque;
    }

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public void setCarroLigado(boolean carroLigado) {
        this.carroLigado = carroLigado;
    }

    public void encherTanque(int litros) {
        litrosNoTanque = litros;
    }
}