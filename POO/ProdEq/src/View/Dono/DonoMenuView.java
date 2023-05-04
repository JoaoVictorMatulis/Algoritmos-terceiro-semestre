package View.Dono;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DonoMenuView extends JFrame implements ActionListener{
    JButton criarAcesso, removerAcesso, atualizarAcesso, verRegistros, verMoradorEsp, VerMoradores;

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

    public DonoMenuView() {
        setTitle("Tela Menu Dono");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-200);
        getContentPane().setLayout(new GridLayout(3, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        criarAcesso = criarButton("Cadastrar Morador");
        add(criarAcesso);

        removerAcesso = criarButton("Remover Cadastro");
        add(removerAcesso);

        atualizarAcesso = criarButton("Atualizar Cadastro");
        add(atualizarAcesso);

        VerMoradores = criarButton("Verificar Moradores");
        add(VerMoradores);

        verMoradorEsp = criarButton("Verificar Morador Especifíco");
        add(verMoradorEsp);

        verRegistros = criarButton("Verificar Registros E/S");
        add(verRegistros);

        /*ok = criarButton("Ok");
        add(ok);

        cancelar = criarButton("Cancelar");
        add(cancelar);*/

        setVisible(true);
        centralizar();
    }

    public JButton criarButton(String texto) {
        JButton b1 = new JButton(texto);
        b1.addActionListener(this);
        b1.setFont(new Font("Arial", Font.BOLD, 24));
        add(b1);
        return b1;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == criarAcesso){
            setVisible(false);
            new CriarAcesso();
        }
        if(e.getSource() == removerAcesso){
            setVisible(false);
            new RemoverAcessoId();
        }
        if(e.getSource() == atualizarAcesso){
            setVisible(false);
            new AtualizarAcesso();
        }
        if(e.getSource() == verRegistros){
            System.out.println("4");
        }
        if(e.getSource() == verMoradorEsp){
            System.out.println("5");
        }
        if(e.getSource() == VerMoradores){
            System.out.println("6");
        }
    }
}
