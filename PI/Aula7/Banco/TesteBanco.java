package Aula7.Banco;

import javax.swing.JOptionPane;

public class TesteBanco {
    public static void main(String[] args){
        AcessaBanco banco = new AcessaBanco(JOptionPane.showInputDialog("Digite um nome para sua conta"));
        String login = JOptionPane.showInputDialog("Digite seu login");
        if(login.equals(banco.getLogin())){
            banco.setConectado(true);
        }else{
            banco.setConectado(false);
        }
        if(banco.isConectado()){
            JOptionPane.showMessageDialog(null,"Login efetuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Login errado");
        }
    }
}
