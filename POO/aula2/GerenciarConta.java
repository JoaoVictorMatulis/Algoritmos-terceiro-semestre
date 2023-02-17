package aula2;
import javax.swing.JOptionPane;
import java.util.Random;

public class GerenciarConta {
    public static void main(String[] args){
        Conta[] conta = new Conta[10];
        int[] agencia = new int[10];
        Object[] escolhas = { "Criar", "Consultar"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
        escolhas, escolhas [0]); //
        if(selectedValue == "Criar"){
            for (int i = 0; i < conta.length; i++) {
                conta[i] = new Conta();
                criarConta(conta[i],agencia);
                System.out.println(conta[i].getAgencia());
                System.out.println(conta[i].getConta());
            }
        }
        else{

        }
    }

    public static void criarConta(Conta conta, int[] agencia){
        Random random = new Random();
        for(int i = 0; i < agencia.length; i++){
            agencia[i] = random.nextInt();
        }
        conta.setAgencia(random.nextInt(2000)+1);
        conta.setConta(random.nextInt(2000)+1);
    }
}