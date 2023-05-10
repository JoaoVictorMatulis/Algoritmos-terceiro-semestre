
package Aula13;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ExAreaTexto extends JFrame implements ActionListener {
	JButton btCopiarTudo, btCopiarSelecao;
	JTextField txtEntrada;
	JTextArea areaEntrada, areaSaida;
	JPanel p1;
	String txt = "";
	public ExAreaTexto(){
		setTitle("Utilizando Área de Texto");
		setSize(640,480);
		getContentPane().setBackground(JColorChooser.showDialog(null, "Escolha a cor", getBackground()));
		GridLayout gl = new GridLayout(4,1,5,5);
		getContentPane().setLayout(gl);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		areaEntrada = criarAreaTexto("Texto de Entrada");
		txtEntrada = criarCaixaTexto();
		p1 = criarPainel();
		btCopiarSelecao = criarBotao("Copia Seleção");
		btCopiarTudo = criarBotao("Copia Tudo");
		btCopiarSelecao.setBounds(200, 30, 120, 40);
		btCopiarTudo.setBounds(320, 30, 120, 40);
		p1.add(btCopiarSelecao);
		p1.add(btCopiarTudo);
		add(p1);		
		
		areaSaida = criarAreaTexto("Texto de Saída");		
		setVisible(true);
	}

	private JPanel criarPainel() {
		JPanel p1 = new JPanel();
		//p1.setLayout(new GridLayout(1, 2));
		p1.setLayout(null);
		p1.setBackground(Color.BLUE); 	
		return p1;
	}

	private JTextField criarCaixaTexto() {
		JTextField texto = new JTextField("Texto de Exemplo");
		texto.setFont(new Font("Times new Roman", Font.BOLD, 18));
		texto.setForeground(Color.red);
		texto.addActionListener(this);
		add(texto);
		return texto;
	}

	private JTextArea criarAreaTexto(String texto) {
		JTextArea area = new JTextArea(texto);
		area.setFont(new Font("Times new Roman", Font.BOLD, 18));
		area.setForeground(Color.blue);
		add(area);
		return area;
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);				
		return botao;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == btCopiarSelecao){			
			txt += txtEntrada.getSelectedText() + "\n" ;
			areaEntrada.setText(txt);
		}
		else if (e.getSource() == btCopiarTudo){
			String txt = areaEntrada.getText();			
			areaSaida.setText(txt);
			areaEntrada.setText("");
			txt = "";
		}	
		else if (e.getSource() == txtEntrada){
			txt += txtEntrada.getText() + "\n" ;
			areaEntrada.setText(txt);
		}
	}
	public static void main(String[] args) {
		new ExAreaTexto();
	}
}