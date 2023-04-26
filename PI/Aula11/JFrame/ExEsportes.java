package Aula11.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ExEsportes extends JFrame implements
        ListSelectionListener, ActionListener {
    // Criando objetos Label, Texto e Botões
    JLabel l1;
    JTextField t1;
    JButton bquant, bindice, bclear;
    JList lista; // Criando objeto Lista
    // Criando objetos listModel a partir da classe DefaultListModel
    DefaultListModel listModel;

    public static void main(String args[]) {
        new ExEsportes();
    }

    public ExEsportes() {
        setSize(300, 250);
        setTitle("Lista esportes");
        t1 = criaTextField();
        t1.addActionListener(this);// adicionando o evento no objeto
        l1 = criarJLabel("Sem selecao");
        bquant = criarBotao("Quantidade", 'q');
        bquant.addActionListener(this); // adicionando o evento no objeto
        bindice = criarBotao("Indice selecionado", 'i');
        bindice.addActionListener(this); // adicionando o evento no objeto
        bclear = criarBotao("Remove item", 'c');
        bclear.addActionListener(this); // adicionando o evento no objeto
        listModel = criarItensLista(); // container com os itens
        lista = new JList(listModel); // adicionando o listModel na Lista.
        lista.addListSelectionListener(this);
        JScrollPane Painel = new JScrollPane(lista);
        setLayout(new GridLayout(6, 1)); // Criando um Layout do tipo Grid
        add(l1);
        add(t1);
        add(Painel);
        add(bquant);
        add(bindice);
        add(bclear);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Tratando os eventos
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == t1)// verifica se foi disparado objeto t1
        {
            listModel.addElement(t1.getText()); // adiciona itens a lista
            System.out.println(t1.getText());
            t1.setText(""); // Limpa a caixa de texto
        }
        if (e.getSource() == bquant)
            // verifica a quantidade de itens da lista
            t1.setText("Quantidade: " + listModel.getSize());
        if (e.getSource() == bindice)
            // verifica o índice do item selecionado
            t1.setText("Indice selecionado: " + lista.getSelectedValue());
        if (e.getSource() == bclear) {
            int resp = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do item: " +
                    lista.getSelectedValue());
            if (resp == 0) {
                int index = lista.getSelectedIndex();
                l1.setText("Removido : " + lista.getSelectedValue());
                listModel.remove(index);
            }
        }
    }

    public void valueChanged(ListSelectionEvent e) {
        l1.setText("Índice Selecionado :" + lista.getSelectedValue());
    }

    public JButton criarBotao(String texto, char tecla) {
        JButton b1 = new JButton();
        b1.setText(texto);
        b1.setBackground(new Color(0, 0, 255));
        b1.setForeground(Color.YELLOW);
        b1.setFont(new Font("Helvetica", Font.BOLD, 12));
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setEnabled(true); // Botão habilidado.
        b1.setMnemonic(tecla); // Tecla de atalho
        return b1;
    }

    public JLabel criarJLabel(String texto) {
        JLabel jl = new JLabel(texto);
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 12));
        return jl;
    }

    public JTextField criaTextField() {
        JTextField jt = new JTextField();
        jt.setFont(new Font("Courier new", Font.BOLD, 12));
        jt.setHorizontalAlignment(JTextField.LEFT);
        return jt;
    }

    private DefaultListModel criarItensLista() {
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Natação");
        listModel.addElement("Corrida");
        listModel.addElement("Luta");
        listModel.addElement("Bicicleta");
        return listModel;
    }
}