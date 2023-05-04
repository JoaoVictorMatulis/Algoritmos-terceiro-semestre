package View.Dono;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RemoverAcessoId extends JFrame implements ActionListener{
    JLabel lnome, lap, lbloco, lcpf, lfone, lemail, lsenha; 
    JTextField tnome, tap, tbloco, tcpf, tfone, temail, tsenha;
    JButton ok, cancelar;
    
    public RemoverAcessoId() {
        setTitle("Remover Acesso");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-200);
        getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lnome = criarLabel("Id: ");
        add(lnome);
        tnome = criarTextField();
        add(tnome);
        
        ok = criarButton("Ok");
        add(ok);
        
        cancelar = criarButton("Cancelar");
        add(cancelar);
        
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
        setLocation((int)(((screen.width - (janela.width*2)) / 1.5f)+janela.width),
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

    public JButton criarButton(String texto) {
        JButton b1 = new JButton(texto);
        b1.addActionListener(this);
        b1.setFont(new Font("Arial", Font.BOLD, 24));
        add(b1);
        return b1;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            System.out.println("1");
        }
        if(e.getSource() == cancelar){
            setVisible(false);
            new DonoMenuView();
        }
    }
}
