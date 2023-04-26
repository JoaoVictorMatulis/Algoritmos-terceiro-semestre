package Aula11.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ExComboBox extends JFrame implements ActionListener, ItemListener
{
	JLabel l1;
	JTextField t1,t2,t3;
	JComboBox combo;
	JButton b1,b2,b3,b4,b5,b6, b7, b8; 

	public static void main(String args[]){
		new ExComboBox();   
	}
	ExComboBox ()
	{
		setTitle("Uso do JComboBox");
		setSize(400,170); 	
		getContentPane().setBackground(new Color(190,190,190)); 
		getContentPane().setLayout(new GridLayout(5,2)); 
		l1 = criarRotulo("Conteudo");		
		String[] cores = {"Branco","Vermelho","Azul","Verde"}; 
		Color corFundo = JColorChooser.showDialog(
			null, "Escolha uma cor de Fundo:", getForeground());
		getContentPane().setBackground(corFundo);
		combo = new JComboBox(cores); 
		combo.addItemListener(this); 
		add(combo);
		b1 = criarBotao("Mostra Texto");
		b4 = criarBotao("Remove Item");
		b2 = criarBotao("Mostra Índice"); 
		b5 = criarBotao("Remove Todos");
		b3 = criarBotao("Adiciona Item"); 	
		t1 = criarCaixaTexto();		 	
		b6 = criarBotao("Quant. Itens");		 
		t2 = criarCaixaTexto();
				
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private JLabel criarRotulo(String texto) {
		JLabel l1 = new JLabel(texto);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Arial", Font.BOLD, 18)); 
		add(l1);
		return l1;
	}
	private JTextField criarCaixaTexto() {
		JTextField t1 = new JTextField(); 
		t1.setHorizontalAlignment(SwingConstants.CENTER);     
		t1.setFont(new Font("Arial", Font.BOLD, 18)); 
		add(t1);
		return t1;
	}
	private JButton criarBotao(String texto) {
		JButton b1 = new JButton(texto); 
		b1.addActionListener(this); 
		b1.setFont(new Font("Arial", Font.BOLD, 24)); 
		b1.setForeground(Color.red);
		add(b1);
		return b1;
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b1)
			l1.setText("Texto: "+combo.getSelectedItem());
		if (e.getSource()==b2)
			l1.setText("Índice: " + combo.getSelectedIndex()); 
		if (e.getSource()==b3)
			if (t1.getText().length()!=0)
			{combo.addItem(t1.getText());//adiciona item
			t1.setText("");      }//limpa o texto de t1 
		if (e.getSource()==b4)
			combo.removeItemAt( (combo.getSelectedIndex())); // remove o item selecionado
		if (e.getSource()==b5)
			combo.removeAllItems(); //remove todos itens 
		if (e.getSource()==b6) 
			t2.setText(""+combo.getItemCount());     
	} //conta a quantidade total de itens
	public void itemStateChanged(ItemEvent e)
	{ 
		t1.setText(""+combo.getSelectedItem());//mostra o item selecionado  
	} 
} 
