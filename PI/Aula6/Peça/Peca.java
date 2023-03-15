package Aula6.Peça;

import javax.swing.JOptionPane;

public class Peca {
    public String nome;
    protected int comprimento;
    private int durabilidade;

    public Peca(){
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        if(comprimento > 0 && comprimento <= 25){
            this.comprimento = comprimento;
        }
        else{
            do{
                comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Comprimento inválido\nDigite outro valor entre 1 e 25"));
            }while(comprimento < 0 || comprimento > 25);
        }
    }

    public int getDurabilidade() {
        return this.durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        if(durabilidade > 0 && durabilidade <= 180){
            this.durabilidade = durabilidade;
        }
        else{
            do{
                durabilidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Comprimento inválido\nDigite outro valor entre 1 e 180"));
            }while(durabilidade < 0 || durabilidade > 180);
        }
    }

    @Override
    public String toString() {
        return "============="+nome+"============="+
                "\nComprimento: "+comprimento+
                "\nDurabilidade: "+durabilidade+
                "\n";
    }    
}
