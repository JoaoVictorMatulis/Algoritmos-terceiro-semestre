package View;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MoradorView extends JFrame implements ActionListener{
    JLabel senhaLabel;
    JPasswordField password;
    JButton ok, cancelar;
    DonoMenuView m = new DonoMenuView();
    Boolean a = true;

    public void centralizar() {
        // obtém a altura e largura da resolução vídeo
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // obtém a altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - (janela.width*2)) / 3,
            (screen.height - janela.height) / 2);
    }
    
    public MoradorView() {
        setTitle("Tela do Morador");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-200);
        getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        senhaLabel = criarLabel("Senha: ");
        add(senhaLabel);

        password = criarPasswordField();
        add(password);

        ok = criarButton("Ok");
        add(ok);

        cancelar = criarButton("Cancelar");
        add(cancelar);

        setVisible(true);
        centralizar();
        //startloop();
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

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            String s = String.valueOf(password.getPassword());
            if(a){
                m.setVisible(false);
                a=false;
            }else{
                m.setVisible(true);
                a=true;
            }
            
        }
        if(e.getSource() == cancelar){
            System.out.println("Cancel1");
        }
    }
}
