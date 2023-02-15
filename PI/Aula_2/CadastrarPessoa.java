import javax.swing.JOptionPane;

public class CadastrarPessoa {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        String endereco = JOptionPane.showInputDialog("Digite seu endereço");

        Pessoa joao = new Pessoa(nome, idade, endereco);
        JOptionPane.showMessageDialog(null, joao.nome + " tem " + joao.idade + " e mora no endereço: " + joao.endereco);

        nome = JOptionPane.showInputDialog("Digite seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        endereco = JOptionPane.showInputDialog("Digite seu endereço");

        Pessoa maria = new Pessoa(nome, idade, endereco);
        JOptionPane.showMessageDialog(null,
                maria.nome + " tem " + maria.idade + " e mora no endereço: " + maria.endereco);
    }
}