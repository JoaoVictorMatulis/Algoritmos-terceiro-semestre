package Aula7.Circulo;

public class Circulo {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        if(raio>0){
            this.raio = raio;
        }
    }

}
