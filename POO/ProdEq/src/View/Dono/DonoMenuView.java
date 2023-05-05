/*
 * Turma: A
    Autores: João Victor Matulis || Id de aluno: 1142445416
            Bernardo Galvão de Souza || Id de aluno: 1142473154
            Gabriel de Melo Silva || Id de aluno: 1141267353
            Kevin de Sousa dos Santos || Id de aluno: 1142168549

    Professor: Carlos Veríssimo
 */
package View.Dono;

import Controller.CriarAcessoController;
import Controller.RemoverAcessoIdController;
import Controller.VerificarMoradoresController;

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

        criarAcesso = criarButton("Cadastrar Morador",Color.white);
        add(criarAcesso);

        removerAcesso = criarButton("Remover Cadastro",Color.white);
        add(removerAcesso);

        atualizarAcesso = criarButton("Atualizar Cadastro",Color.gray);
        add(atualizarAcesso);

        VerMoradores = criarButton("Verificar Moradores",Color.white);
        add(VerMoradores);

        verMoradorEsp = criarButton("Verificar Morador Especifíco",Color.gray);
        add(verMoradorEsp);

        verRegistros = criarButton("Verificar Registros E/S",Color.gray);
        add(verRegistros);

        /*ok = criarButton("Ok");
        add(ok);

        cancelar = criarButton("Cancelar");
        add(cancelar);*/

        setVisible(true);
        centralizar();
    }

    public JButton criarButton(String texto, Color color) {
        JButton b1 = new JButton(texto);
        b1.addActionListener(this);
        b1.setBackground(color);
        b1.setFont(new Font("Arial", Font.BOLD, 24));
        add(b1);
        return b1;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == criarAcesso){
            setVisible(false);
            CriarAcessoController controller = new CriarAcessoController();
            controller.view();
        }
        if(e.getSource() == removerAcesso){
            setVisible(false);
            RemoverAcessoIdController controller = new RemoverAcessoIdController();
            controller.view();
        }
        if(e.getSource() == atualizarAcesso){
            int id = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Digite o id do morador: "));
            if(id == 1){
                setVisible(false);
                new AtualizarAcesso();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Id inválido");
            }
        }
        if(e.getSource() == verRegistros){
            setVisible(false);
            new VerificarRegistros();
        }
        if(e.getSource() == verMoradorEsp){
            int id = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Digite o id do morador: "));
            if(id == 1){
                JOptionPane.showMessageDialog(rootPane, "ID: 1 - Nome: Jonas| Ap: 203 | Bloco: 2 | CPF: 108329123 | Telefone: 3123123 | Email: teste@gmail.com");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Id inválido");
            }
        }
        if(e.getSource() == VerMoradores){
            setVisible(false);
            VerificarMoradoresController controller = new VerificarMoradoresController();
            controller.viewMoradores();
        }
    }
}
