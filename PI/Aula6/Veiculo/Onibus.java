package Aula6.Veiculo;

public class Onibus extends Veiculo{
    private int passageiros;

    public Onibus(String placa, int ano,int passageiros) {
        super(placa, ano);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public void mostarDados(){
        super.mostarDados();
        System.out.println("Passageiros: "+passageiros+"\n");
    }
}
