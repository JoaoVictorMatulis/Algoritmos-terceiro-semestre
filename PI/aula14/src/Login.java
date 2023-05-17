import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
public class Login extends JFrame implements ActionListener{
    JLabel labelNome, labelSenha;
    JTextField textNome;
    JPasswordField textSenha;
    JButton ok,cancelar;
    public Login(){
        setTitle("Login");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-100);
        getContentPane().setLayout(new GridLayout(3, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelNome = criarLabel("Nome: ");
        textNome = criarTextField();
        labelSenha = criarLabel("Senha: ");
        textSenha = criarPasswordField();
        ok = criarButton("Ok");
        cancelar = criarButton("Cancelar");

        setVisible(true);
        centralizar();
    }

    public void centralizar() {
        // obtém a altura e largura da resolução vídeo
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // obtém a altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - (janela.width))/2,
            (screen.height - janela.height) / 2);
    }

    public JLabel criarLabel(String texto) {
        JLabel l1 = new JLabel(texto);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        add(l1);
        return l1;
    }

    public JTextField criarTextField(){
        JTextField jt = new JTextField();
        jt.setHorizontalAlignment(SwingConstants.CENTER);
        jt.setFont(new Font("Arial", Font.PLAIN, 18));
        add(jt);
        return jt;
    }

    public JPasswordField criarPasswordField(){
        JPasswordField jp = new JPasswordField();
        jp.setHorizontalAlignment(SwingConstants.CENTER);
        jp.setFont(new Font("Arial", Font.PLAIN, 18));
        add(jp);
        return jp;
    }

    public JButton criarButton(String texto) {
        JButton b1 = new JButton(texto);
        b1.addActionListener(this);
        b1.setFont(new Font("Arial", Font.BOLD, 24));
        add(b1);
        return b1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            String nome = textNome.getText();
            String senha = String.valueOf(textSenha.getPassword());
            textNome.setText("");
            textSenha.setText("");
            Connection cn = ConectaBanco.getConexao(nome,senha);
            if(cn != null){
                JOptionPane.showMessageDialog(rootPane,"Bem vindo!");
                setVisible(false);
                new Cadastro(cn);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Senha invalida");
            }
            textNome.setText("");
            textSenha.setText("");
        }
        if(e.getSource() == cancelar){
            textNome.setText("");
            textSenha.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
