/*
 * Turma: A
    Autores: João Victor Matulis || Id de aluno: 1142445416
            Bernardo Galvão de Souza || Id de aluno: 1142473154
            Gabriel de Melo Silva || Id de aluno: 1141267353
            Kevin de Sousa dos Santos || Id de aluno: 1142168549

    Professor: Carlos Veríssimo
 */
package View.Dono;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AtualizarAcesso extends JFrame implements ActionListener{
    JLabel lnome, lap, lbloco, lcpf, lfone, lemail, lsenha; 
    JTextField tnome, tap, tbloco, tcpf, tfone, temail, tsenha;
    JButton ok, cancelar;
    
    public AtualizarAcesso() {
        setTitle("Atualizar Dados(Não Funcional)");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-200);
        getContentPane().setLayout(new GridLayout(8, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lnome = criarLabel("Nome: ");
        add(lnome);
        tnome = criarTextField("Jonas");
        add(tnome);

        lap = criarLabel("Número do Apartamento:");
        add(lap);
        tap = criarTextField("203");
        add(tap);
        
        lbloco = criarLabel("Número do Bloco:");
        add(lbloco);
        tbloco = criarTextField("2");
        add(tbloco);

        lcpf = criarLabel("CPF: ");
        add(lcpf);
        tcpf = criarTextField("108329123");
        add(tcpf);

        lfone = criarLabel("(Opcional)Telefone: ");
        add(lfone);
        tfone = criarTextField("3123123");
        add(tfone);

        lemail = criarLabel("Email: ");
        add(lemail);
        temail = criarTextField("teste@gmail.com");
        add(temail);

        lsenha = criarLabel("Senha: ");
        add(lsenha);
        tsenha = criarPasswordField();
        add(tsenha);

        
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

    public JTextField criarTextField(String texto){
        JTextField jt = new JTextField();
        jt.setText(texto);
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
            int confirmacao = JOptionPane.showConfirmDialog(rootPane,"Confirmar Atualização?","Confirmação",2);
            if(confirmacao == 0){
                JOptionPane.showMessageDialog(rootPane, "Acesso Atualizado");
                setVisible(false);
                new DonoMenuView();
            }
        }
        if(e.getSource() == cancelar){
            setVisible(false);
            new DonoMenuView();
        }
    }
}
