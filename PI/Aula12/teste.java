package Aula12;

import java.awt.*;	
import javax.swing.*;
public class teste extends JFrame{
	JButton b1, b2, b3, b4;	
    JPanel p1, p2;
	
    public teste(){
		setTitle("Teste JPanel");	
		setSize(260,200);		
		getContentPane().setLayout(new GridLayout(2,1,0,40));
		getContentPane().setBackground(new Color(185,195,244));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1 = criarBotao("Gravar", 'G');	
		b2 = criarBotao("Sair", 'S');		
		b3 = criarBotao("Cancelar", 'C');
		b4 = criarBotao("Alterar", 'A');

		p1 = criarPainel(Color.BLUE, b1, 2);	
		p1.add(b4);     
		p2 = criarPainel(Color.YELLOW, b2, 2); 	
		p2.add(b3);		

		setVisible(true);		
		setLocationRelativeTo(null);		

	}	
	private JButton criarBotao(String texto, char atalho) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(atalho);		
		return botao;
	}
	private JPanel criarPainel(Color corFundo, JButton botao, int linhas) {
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(linhas,1,0,0));
		painel.setBackground(corFundo);
		painel.add(botao);
		add(painel);
		return painel;
	}
	public static void main(String [] args){
		new teste();
	}	
}
