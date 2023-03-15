package Aula6.Veiculo;

import javax.swing.JOptionPane;

public class Cadastro {
    
    static Onibus[] onibus = new Onibus[4];
    static int indiceOnibus = 0;
    static Caminhao[] caminhao = new Caminhao[1];
    static int indiceCaminhao = 0;

    public static void main(String[] args){
        Object[] escolhas = {"Cadastrar Onibus","Cadastrar Caminhão","Desligar"};
        Object selectValue;
        do{
            selectValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);

            switch((String)selectValue){
                case "Cadastrar Onibus":
                    cadastrarOnibus();
                    break;
                case "Cadastrar Caminhão":
                    cadastrarCaminhao();
                    break;
            }
        }while(!selectValue.equals("Desligar"));
        if(indiceOnibus > 0){
            System.out.println("================Onibus================");
            for(int i = 0; i < indiceOnibus; i++){
                onibus[i].mostarDados();
            }
        }
        if(indiceCaminhao >0){
            System.out.println("\n================Caminhão================");
            for(int i = 0; i < indiceCaminhao; i++){
                caminhao[i].mostarDados();
            }
        }
    }

    public static void cadastrarOnibus(){
        if(indiceOnibus < onibus.length){
            String placa = JOptionPane.showInputDialog(null,"Digite a placa do Caminhão");
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Dgite o ano"));
            int passageiros = Integer.parseInt(JOptionPane.showInputDialog(null,"Dgite o número de passageiros"));
            onibus[indiceOnibus++] = new Onibus(placa, ano, passageiros);
        }else{
            onibus = alocarNovoArrayOnibus(onibus);
            cadastrarOnibus();
        }
    }

    private static Onibus[] alocarNovoArrayOnibus(Onibus[] onibus) {
        Onibus[] novo = new Onibus[onibus.length + 4];
        System.arraycopy(onibus, 0, novo, 0, onibus.length);
        return novo;
    }

    public static void cadastrarCaminhao(){
        if(indiceCaminhao < caminhao.length){
            String placa = JOptionPane.showInputDialog(null,"Digite a placa do Onibus");
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Dgite o ano"));
            int carga = Integer.parseInt(JOptionPane.showInputDialog(null,"Dgite o peso da carga"));
            caminhao[indiceCaminhao++] = new Caminhao(placa, ano, carga);
        }else{
            caminhao = alocarNovoArrayCaminhao(caminhao);
            cadastrarOnibus();
        }
    }

    private static Caminhao[] alocarNovoArrayCaminhao(Caminhao[] caminhao) {
        Caminhao[] novo = new Caminhao[caminhao.length + 4];
        System.arraycopy(caminhao, 0, novo, 0, caminhao.length);
        return novo;
    }
}
