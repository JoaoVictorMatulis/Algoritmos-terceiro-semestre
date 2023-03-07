package ADO;
import javax.swing.JOptionPane;
public class Acesso {
    public static void main(String[] args){
        Object selectedValue;
        do{
            Object[] escolhas = { "Adicionar Livro", "Pesquisar Livro", "Remover Livro", "Desligar Programa"};
            selectedValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectedValue != "Desligar Programa"){
                switch((String)selectedValue){
                    case "Criar conta":  
                        break;
                    case "Login":
                        break;
                }
            }
        }while(selectedValue != "Desligar Programa");
        
    }
}
