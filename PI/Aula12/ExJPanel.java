package Aula12;

import java.awt.*;
import javax.swing.*;
public class ExJPanel extends JFrame{
	JButton b1, b2, b3, b4;
	JPanel p1, p2;

	public ExJPanel() {
		setTitle("Teste JPanel");
		setSize(200, 200);
		getContentPane().setLayout(new GridLayout(2, 1, 0, 40));
		getContentPane().setBackground(new Color(185,195,244));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        b1 = criarBotao("Gravar");
		b2 = criarBotao("Alterar");
        b3 = criarBotao("Sair");
        b4 = criarBotao("Cancelar");

		GridLayout gl = new GridLayout(2, 1, 0, 0);

		p1 = criarPainel(Color.blue, gl, b1);
        p1.add(b2);
		p2 = criarPainel(Color.yellow, gl, b3);
        p2.add(b4);

		setVisible(true);
		setLocationRelativeTo(null);
	}

	private JButton criarBotao(String texto) {
		JButton b1 = new JButton(texto);
		//b1.setBounds(20, 120, 100, 30);
		return b1;
	}

	private JPanel criarPainel(Color cor, GridLayout gl, JButton botao1) {
        JPanel p1 = new JPanel();
		p1.setLayout(gl);
		p1.setBackground(cor);
		p1.add(botao1);
		add(p1);
		return p1;
	}

	public static void main(String[] args) {
		new ExJPanel();
	}
}
