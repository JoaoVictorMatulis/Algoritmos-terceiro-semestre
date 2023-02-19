package aula2;
import javax.swing.JOptionPane;
import java.util.Random;

public class GerenciarConta {
    public static void main(String[] args){
        Conta[] conta = new Conta[10];
        for (int i = 0; i < conta.length; i++) {
            conta[i] = new Conta();
        }
        Object[] agencia = criarAgencias();
        int contadorContas = 0;
        Object selectedValue;
        do{
            Object[] escolhas = { "Criar conta", "Login", "Desligar"};
            selectedValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectedValue != "Desligar"){
                switch((String)selectedValue){
                    case "Criar conta":
                        if(contadorContas != 10){
                            if(selectedValue == "Criar conta"){
                                criarConta(conta, agencia, contadorContas);
                                contadorContas++;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Limite maximo de contas atingido");
                        }
                        break;
                    case "Login":
                        entrarConta(conta, agencia);
                        break;
                }
            }
        }while(selectedValue != "Desligar");
    }

    public static Object[] criarAgencias(){
        Object[] agencia = new Object[10];
        int[] a = new int[10];
        Random random = new Random();
        for(int i = 0; i < agencia.length; i++){
            int aleatorio = random.nextInt(2000);
            while(aleatorio< 1000){
                aleatorio = random.nextInt(2000);
            }
            a[i] = aleatorio;
        }
        bubbleSort(a);
        for(int i = 0; i < agencia.length; i++){
            agencia[i] = a[i];
        }
        return agencia;
    }

    public static int[] bubbleSort(int[] vetor) {
        int aux = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        return vetor;
    }

    public static void criarConta(Conta[] conta, Object[]agencia, int contadorContas){
        Object agenciaSelect = JOptionPane.showInputDialog(null,"Selecione sua Agencia", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
        agencia, agencia [0]);
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para sua conta"));
        for(int i = 0; i < conta.length; i++){
            while(numConta == conta[i].getConta()){
                numConta = Integer.parseInt(JOptionPane.showInputDialog("Este número já está sendo usado.\nPor favor digite outro número")); 
            }
            for(int m = 0; m < conta.length; m++){
                while(numConta == conta[m].getConta() && m!=i){
                    numConta = Integer.parseInt(JOptionPane.showInputDialog("Este número já está sendo usado.\nPor favor digite outro número"));
                }
            }
        }
        String senha = JOptionPane.showInputDialog("Digite uma senha para sua conta");
        String repetirSenha = JOptionPane.showInputDialog("Digite novamente sua senha");
        while(!senha.equals(repetirSenha)){
            JOptionPane.showMessageDialog(null,"As senhas não são iguais");
            senha = JOptionPane.showInputDialog("Digite uma senha para sua conta");
            repetirSenha = JOptionPane.showInputDialog("Digite de novo sua senha");
        }
        conta[contadorContas].setAgencia((int) agenciaSelect);
        conta[contadorContas].setConta(numConta);
        conta[contadorContas].setSenha(senha);
    }

    public static void entrarConta(Conta[] conta, Object[]agencia){
        Object agenciaSelect = JOptionPane.showInputDialog(null,"Selecione sua Agencia", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
        agencia, agencia [0]);
        boolean verificarAgencia = false;
        for(int i = 0; i < conta.length; i++){
            if(conta[i].getAgencia() == (int)agenciaSelect){
                verificarAgencia = true;
                int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta"));
                String senha = JOptionPane.showInputDialog("Digite sua senha");
                if(numConta == conta[i].getConta() && senha.equals(conta[i].getSenha())){
                    JOptionPane.showMessageDialog(null,"Login efetuado com sucesso");
                    gerenciarConta(i, conta);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Senha ou número da conta está errado");
                }
            }
        }
        if(verificarAgencia == false){
            JOptionPane.showMessageDialog(null,"Nenhuma conta dessa agencia foi cadastrado");
        }
    }

    public static void gerenciarConta(int indice, Conta[] conta){
        Object selectedAcao;
        do{
            Object[] acoes = { "Consultar Saldo", "Deposito", "Saque","Log out"};
            selectedAcao = JOptionPane.showInputDialog(null,"O que gostaria de fazer?", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            acoes, acoes [0]);
            switch ((String)selectedAcao) {
                case "Consultar Saldo":
                    saldo(indice, conta);
                    break;
                case "Deposito":
                    depositar(indice, conta);
                    break;
                case "Saque":
                    saque(indice, conta);
                    break;
                case "Log out":
                    JOptionPane.showMessageDialog(null,"Log out efetuado com sucesso");
                    break;
            }
        }while(selectedAcao != "Log out");
    }
    
    public static void saldo(int indice, Conta[] conta){
        JOptionPane.showMessageDialog(null,"Saldo Atual: R$"+conta[indice].getSaldo());
    }

    public static void depositar(int indice, Conta[] conta){
        double valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto você quer depositar:"));
        conta[indice].deposito(valorDeposito);
        JOptionPane.showMessageDialog(null,"Deposito efetuado com sucesso\nSaldo atual: R$"+conta[indice].getSaldo());
    }

    public static void saque(int indice, Conta[] conta){
        double valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto você quer sacar:"));
        if(valorSaque <= conta[indice].getSaldo() && valorSaque > 0){
            conta[indice].saque(valorSaque);
            JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso\nSaldo atual: R$"+conta[indice].getSaldo());
        }
        else{
            JOptionPane.showMessageDialog(null,"Não foi possível efetuar o saque.\nO valor solicitado excede o saldo atual da conta");
        }
    }

}
