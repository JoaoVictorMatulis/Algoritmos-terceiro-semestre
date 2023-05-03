package Aula12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExLogin extends JFrame implements ActionListener {
    JLabel usuarioLabel, senhaLabel;
    JTextField usuarioTextField;
    JPasswordField password;
    JButton ok, cancelar;

    public ExLogin() {
        setTitle("Login");
        setSize(250, 200);
        getContentPane().setLayout(new GridLayout(3, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        usuarioLabel = criarLabel("Usuário: ");
        add(usuarioLabel);

        usuarioTextField = criarTextField();
        add(usuarioTextField);

        senhaLabel = criarLabel("Senha: ");
        add(senhaLabel);

        password = criarPasswordField();
        add(password);

        ok = criarButton("Ok");
        add(ok);

        cancelar = criarButton("Cancelar");
        add(cancelar);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public JLabel criarLabel(String texto) {
        JLabel l1 = new JLabel(texto);
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        l1.setFont(new Font("Arial", Font.PLAIN, 18));
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

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            String s = String.valueOf(password.getPassword());
            if(usuarioTextField.getText().equals("Joao") && s.equals("oi")){
                System.exit(0);
            }
        }
        if(e.getSource() == cancelar){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ExLogin();
    }
}
