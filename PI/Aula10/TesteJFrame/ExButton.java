package Aula10.TesteJFrame;

import java.awt.*;
import javax.swing.*;

class ExButton extends JFrame {
    JLabel jNome,jCPF,jRG,jEndereco,jLogradouro;
    JTextField jtNome,jtCPF,jtRG,jtEndereco,jtLogradouro;
    JButton enviar,cancelar;
    public ExButton() {
        // Titulo da janela
        setTitle("ATUALIZA DADOS CADASTRAIS");
        // tamanho da janela
        setSize(800, 250);
        centralizar();
        // anula o layout padrao
        getContentPane().setLayout(null);
        // cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(235, 235, 255));
        setVisible(true);
        int x = 10;
        int y = 10;
        int alt = 30;
        jCPF = criarJLabel("CPF ", x, y, 28, alt);
        jtCPF = criaTextField(x+=30, y, 95, alt);
        x = 10;
        jRG = criarJLabel("RG ", x+=150, y, 24, alt);
        jtRG = criaTextField(x+=20, y, 95, alt);
        x = 10;
        jNome = criarJLabel("Nome ", x, y+=38, 46, alt);
        jtNome = criaTextField(x+=30, y, 295, alt);
        x = 10;
        jLogradouro = criarJLabel("Logradouro  ", x, y+=38, 84, alt);
        jtLogradouro = criaTextField(x+=80, y, 95, alt);
        jEndereco = criarJLabel("Endereço  ", x+=120, y, 84, alt);
        jtEndereco = criaTextField(x+=80, y, 295, alt);
        // provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JLabel criarJLabel(String texto, int x, int y, int larg, int alt) {
        JLabel jl = new JLabel(texto);
        jl.setBounds(x, y, larg, alt);
        // Torna opaco o fundo do rótulo
        //jl.setOpaque(true);
        jl.setBackground(new Color(255, 255, 255));
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 12));
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setVerticalAlignment(SwingConstants.TOP);
        add(jl);

        return jl;
    }

    public JTextField criaTextField(int x, int y, int larg, int alt){
        JTextField jt = new JTextField();
        jt.setBounds(x, y, larg, alt);
        jt.setFont(new Font("Courier new", Font.BOLD, 12));
        jt.setHorizontalAlignment(JTextField.LEFT);
        jt.getText();
        //insere o JTextField na Janela
        add(jt);
        return jt;
    }

    public JButton criarBotao(String texto, int x, int y, int larg, int alt){
        JButton b1 = new JButton();
        b1.setText(texto);
        //50 posição x, 30 posição y, 100 largura, 30 altura
        b1.setBounds(x, y, larg, alt); //D Esq, D Topo, larg, alt
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

    public static void main(String[] args) {
        ExButton janela = new ExButton();
        janela.setVisible(true);
    }
}