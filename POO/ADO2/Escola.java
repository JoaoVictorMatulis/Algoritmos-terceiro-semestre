/*
 * Autor: João Victor Matulis 
 * email: jvmatulis@gmail.com
 * Id: 1142445416
 * 
 * Professor: Carlos Veríssimo
 * email: carlos.hvpereira@sp.senac.br
*/
package ADO2;

import javax.swing.JOptionPane;

public class Escola {
    public static void main(String[] args){
        Pessoa pessoa;
        Object[] escolhas = {"Aluno","Professor","Funcionario","Desligar"};
        Object selectedValue;
        do{
            selectedValue = JOptionPane.showInputDialog(null,"Escolha para quem você quer mandar um email", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            switch((String)selectedValue){
                case "Aluno":
                    pessoa = new Aluno();
                    break;
                case "Professor":
                    pessoa = new Professor();
                    break;
                case "Funcionario":
                    pessoa = new Funcionario();
                    break;
            }
        }while(selectedValue != "Desligar");            
    }
}
