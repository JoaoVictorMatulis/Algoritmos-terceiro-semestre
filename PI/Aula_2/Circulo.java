public class Circulo {

    private double raio;

    Circulo() {

    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Raio invalido");
        }
    }

    public double getRaio() {
        return this.raio;
    }
}
