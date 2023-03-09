/*
 * Auto: João Victor Matulis 
 * email: jvmatulis@gmail.com
 * Id: 1142445416
 * 
 * Professor: Carlos Veríssimo
 * email: carlos.hvpereira@sp.senac.br
*/
import javax.swing.JOptionPane;

public class Acesso {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Digite seu login:");
        String senha = JOptionPane.showInputDialog("Digite uma senha:");
        String senhaRepetir = JOptionPane.showInputDialog("Digite novamente a senha:");
        while (!senha.equals(senhaRepetir)) {
            JOptionPane.showMessageDialog(null, "Digite a mesma senha");
            senha = JOptionPane.showInputDialog("Digite uma senha:");
            senhaRepetir = JOptionPane.showInputDialog("Digite novamente a senha:");
        }
        Conta conta = new Conta(usuario, senha);
        Object selectedValue;
        boolean logado = false;
        do {
            Object[] escolhas = { "Login", "Desligar Programa" };
            selectedValue = JOptionPane.showInputDialog(null, "Escolha uma das opções abaixo:", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    escolhas, escolhas[0]);
            if (selectedValue.equals("Login")) {
                logado = login(conta);
            }
            if (logado == false) {
                selectedValue = "Desligar Programa";
            } else {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                selectedValue = "Desligar Programa";
            }
        } while (!selectedValue.equals("Desligar Programa"));
    }

    public static boolean login(Conta conta) {
        int tentativa = 3;
        boolean logado = false;
        while (tentativa > 0 && logado != true) {
            String usuario = JOptionPane.showInputDialog("Digite seu login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");
            if (conta.getSenha().equals(senha) && conta.getUsuario().equals(usuario)) {
                logado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha inválido");
                tentativa--;
            }
        }
        if (tentativa == 0) {
            JOptionPane.showMessageDialog(null, "Bloqueando sistema\nMotivo: Várias tentativas de login inválidas");
        }
        return logado;
    }
}