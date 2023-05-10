package Aula13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Aula13.ExAreaTexto;

public class ExMenu  extends JFrame implements ActionListener {
	JMenuBar barraMenu;
	JMenu arquivo, editar, exibir;
	JMenuItem novo, salvar, sair, copiar, colar, recortar, tudo, selecao;
	
	public ExMenu(){
		setTitle("Usando Menus");
		setSize(350,200);
		getContentPane().setBackground(JColorChooser.showDialog(null, 
				"Escolha a cor", getBackground()));
		
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		arquivo = criarMenu("Arquivo", 'A');
		editar = criarMenu("Editar", 'E');
		exibir = criarMenu("Exibir", 'X');
		
		//itens do Menu Arquivo
		novo = criarItemMenu("Novo", 'N');		
		salvar = criarItemMenu("Salvar", 'S');
		sair = criarItemMenu("Sair", 'r');
		
		//itens do Menu Editar		
		copiar = criarItemMenu("Copiar", 'C');
		colar = criarItemMenu("Colar", 'o');
		recortar = criarItemMenu("Recortar", 'r');
		
		//itens do Menu Exibir		
		tudo = criarItemMenu("Tudo", 'T');
		selecao = criarItemMenu("Seleção", 'ç');
		
		arquivo.add(novo);
		arquivo.add(salvar);
		arquivo.add(sair);
		
		editar.add(copiar);
		editar.add(colar);
		editar.add(recortar);
		
		exibir.add(tudo);
		exibir.add(selecao);
		
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		barraMenu.add(exibir);		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JMenuItem criarItemMenu(String texto, char c) {
		JMenuItem itemMenu = new JMenuItem(texto);
		itemMenu.setMnemonic(c);
		itemMenu.addActionListener(this);
		return itemMenu;
	}
	private JMenu criarMenu(String texto, char c) {
		JMenu menu = new JMenu(texto);
		menu.setMnemonic(c);
		return menu;
	}
	public static void main(String[] args) {
		new ExMenu();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==salvar) {
			JOptionPane.showMessageDialog(null, 
					"Clicado no item de menu Salvar");	
		}
		else if(e.getSource()==novo) {
			JOptionPane.showMessageDialog(null, 
					"Clicado no item de menu Novo");	
		}
		else if(e.getSource()==tudo) {
			JOptionPane.showMessageDialog(null, 
					"Vamos abrir o exemplo de Área de Texto");
			new ExAreaTexto();
		}
		else if(e.getSource()==sair) {
			JOptionPane.showMessageDialog(null, 
					"Clicado no item de menu Sair");	
			int resp = JOptionPane.showConfirmDialog(null, "Confirma o encerramento?");
			if(resp==0)
				System.exit(0);
		}		
	}
}
