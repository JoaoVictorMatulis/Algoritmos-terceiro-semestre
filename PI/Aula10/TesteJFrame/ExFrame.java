package Aula10.TesteJFrame;

import java.awt.*;
import javax.swing.*;

public class ExFrame extends JFrame {

    JLabel jNome, jCPF;
    JTextField jtNome, jtCPF;

    public ExFrame(String titulo, int altJanela, int larg) {
        // Titulo da janela
        setTitle(titulo);
        // tamanho da janela
        setSize(larg, altJanela);
        centralizar();
        // anula o layout padrao
        getContentPane().setLayout(null);
        Color corFundo = JColorChooser.showDialog(null,"Choose Background Color",getBackground());
        // cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(corFundo);
        int alt = 30;
        int posin = 10;
        int altin = 10;
        jNome = criarJLabel("Nome: ", posin,altin,45,alt);
        jtNome = criaTextField(posin+=50,altin,550,alt);
        posin = 10;
        altin += alt + 10;
        jCPF = criarJLabel("CPF: ", posin,altin,45,alt);
        jtCPF = criaTextField(posin+=50,altin,550,alt);
        setVisible(true);
        // provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JLabel criarJLabel(String texto, int esq, int topo, int larg, int alt) {
        JLabel jl = new JLabel(texto);
        jl.setBounds(esq, topo, larg, alt);
        // Torna opaco o fundo do rótulo
        // jl.setOpaque(true);
        jl.setBackground(new Color(255, 255, 255));
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 12));
        jl.setToolTipText("Digite seu nome");
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setVerticalAlignment(SwingConstants.TOP);
        add(jl);

        return jl;
    }

    public JTextField criaTextField(int esq, int topo, int larg, int alt) {
        JTextField jt = new JTextField();
        jt.setBounds(esq, topo, larg, alt);
        jt.setFont(new Font("Courier new", Font.BOLD, 12));
        jt.setHorizontalAlignment(JTextField.LEFT);
        jt.getText();
        // insere o JTextField na Janela
        add(jt);
        return jt;
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
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog(null, "Digite o titulo da janela");
        int alt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura da janela"));
        int larg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a largura da janela"));
        ExFrame frame = new ExFrame(titulo, alt, larg);
    }
}
