package Aula10.TesteJFrame;

import java.awt.*;
import javax.swing.*;

class TesteJFrame extends JFrame {
    JLabel jNome,jCPF;
    JTextField jtNome,jtCPF;
    JButton enviar,cancelar;
    public TesteJFrame() {
        // Titulo da janela
        setTitle("Primeira Janela Swing");
        // tamanho da janela
        setSize(600, 500);
        centralizar();
        // anula o layout padrao
        getContentPane().setLayout(null);
        // cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(0, 255, 255));
        setVisible(true);
        int alt = 30;
        int posin = 10;
        int altin = 10;
        jNome = criarJLabel("Nome: ", posin,altin,45,alt);
        jtNome = criaTextField(posin+=50,altin,350,alt);
        posin = 10;
        altin += alt + 10;
        jCPF = criarJLabel("CPF: ", posin,altin,45,alt);
        jtCPF = criaTextField(posin+=50,altin,350,alt);
        posin = 10;
        altin += alt;
        enviar = criarBotao("Enviar", posin+=55,altin+20,120,alt);
        posin = 10;
        cancelar = criarBotao("Cancelar", posin+=250,altin+20,120,alt);
        // provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centralizar() {
        // obtém a altura e largura da resolução vídeo
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screen);
        // obtém a altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    public JLabel criarJLabel(String texto, int esq, int topo, int larg, int alt) {
        JLabel jl = new JLabel(texto);
        jl.setBounds(esq, topo, larg, alt);
        // Torna opaco o fundo do rótulo
        jl.setOpaque(true);
        jl.setBackground(new Color(255, 255, 255));
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 12));
        jl.setToolTipText("Digite seu nome");
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setVerticalAlignment(SwingConstants.TOP);
        add(jl);

        return jl;
    }

    public JTextField criaTextField(int esq, int topo, int larg, int alt){
        JTextField jt = new JTextField();
        jt.setBounds(esq, topo, larg, alt);
        jt.setFont(new Font("Courier new", Font.BOLD, 12));
        jt.setHorizontalAlignment(JTextField.LEFT);
        jt.getText();
        //insere o JTextField na Janela
        add(jt);
        return jt;
    }

    public JButton criarBotao(String texto, int esq, int topo, int larg, int alt){
        JButton b1 = new JButton();
        b1.setText(texto);
        //50 posição x, 30 posição y, 100 largura, 30 altura
        b1.setBounds(esq, topo, larg, alt); //D Esq, D Topo, larg, alt
        b1.setBackground(new Color(0,0,170));
        b1.setForeground(Color.YELLOW);
        b1.setFont(new Font("Helvetica", Font.BOLD, 12));
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setEnabled(true); //Botão desabilitado.
        b1.setMnemonic('e'); //Tecla de atalho
        add(b1);
        return b1;
    }

    public static void main(String[] args) {
        TesteJFrame janela = new TesteJFrame();
        janela.setVisible(true);
    }
}