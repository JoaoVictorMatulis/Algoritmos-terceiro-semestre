package Aula12;

import java.awt.*;
import javax.swing.*;
public class TesteJPanel extends JFrame{
	JButton b1, b2;
	JPanel p1, p2;

	public TesteJPanel() {
		setTitle("Teste JPanel");
		setSize(200, 200);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = criarBotao("Gravar");
		b2 = criarBotao("Sair");

		GridLayout gl = new GridLayout(2, 1, 1, 1);

		p1 = criarPainel(Color.BLUE, gl, b1);
		p2 = criarPainel(Color.YELLOW, gl, b2);

		setVisible(true);
		setLocationRelativeTo(null);
	}

	private JButton criarBotao(String texto) {
		JButton b1 = new JButton(texto);
		//b1.setBounds(20, 120, 100, 30);
		return b1;
	}

	private JPanel criarPainel(Color cor, GridLayout gl, JButton botao) {
		JPanel p1 = new JPanel();
		getContentPane().setLayout(gl);
		//p1.setBounds(10, 120, 140, 70);
		p1.setBackground(cor);
		p1.add(botao);

		add(p1);

		return p1;
	}

	public static void main(String[] args) {
		new TesteJPanel();
	}
}
