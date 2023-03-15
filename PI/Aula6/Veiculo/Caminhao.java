package Aula6.Veiculo;

public class Caminhao extends Veiculo{
    private int pesoCarga;

    public Caminhao(String placa, int ano, int pesoCarga){
        super(placa, ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return this.pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void mostarDados() {
        System.out.println("Placa: "+super.getPlaca()+"\nAno: "+super.getAno()+"\nPeso da carga: "+pesoCarga+"\n");
    }
}