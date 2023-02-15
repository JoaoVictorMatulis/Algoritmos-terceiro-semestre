import pacote2.Carro;

public class TesteCarro {
    public static void main(String args[]) {
        Carro carro = new Carro();
        carro.encherTanque(10);
        carro.setCarroLigado(true);
        System.out.println(carro.isCarroLigado() + " " + carro.getLitrosNoTanque());
    }
}