package Aula6.Peça;

import javax.swing.JOptionPane;

public class Cadastro {
    static Peca[] pecas = new Peca[4];
    static int indicePeca = 0;
    public static void main(String[] args){
        Object[] escolhas = {"Cadastrar Peça","Desligar"};
        Object selectValue;
        do{
            selectValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectValue.equals("Cadastrar Peça")){
                cadastrarPeca();
            }
        }while(!selectValue.equals("Desligar"));
        if(indicePeca > 0){   
            for(int i = 0; i < indicePeca; i++){
                System.out.println(pecas[i]);
            }
        }
    }

    public static void cadastrarPeca(){
        if(indicePeca < pecas.length){
            pecas[indicePeca] = new Peca();
            String nome = JOptionPane.showInputDialog(null,"Digite o nome da peça");
            pecas[indicePeca].setNome(nome);
            int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o comprimento"));
            pecas[indicePeca].setComprimento(comprimento);
            int durabilidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua durabilidade"));
            pecas[indicePeca++].setDurabilidade(durabilidade);
        }else{
            pecas = alocarNovoArray(pecas);
            cadastrarPeca();
        }
    }

    private static Peca[] alocarNovoArray(Peca[] onibus) {
        Peca[] novo = new Peca[onibus.length + 4];
        System.arraycopy(pecas, 0, novo, 0, pecas.length);
        return novo;
    }
}
