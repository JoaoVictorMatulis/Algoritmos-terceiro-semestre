import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cadastro extends JFrame implements ActionListener{
    JLabel labelNome, labelNota;
    JTextField nomeField, notaField;
    JButton ok,cancelar;
    Connection cn;
    public Cadastro(Connection cn){
        this.cn = cn;
        setTitle("Login");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(((int)screen.getWidth()/2)-200, ((int)screen.getHeight()/2)-100);
        getContentPane().setLayout(new GridLayout(3, 2, 0, 0));
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelNome = criarLabel("Nome do aluno: ");

        nomeField = criarTextField();

        labelNota = criarLabel("Nota: ");
        notaField = criarTextField();

        ok = criarButton("Ok");
        add(ok);
        cancelar = criarButton("Cancelar");
        add(cancelar);

        setVisible(true);
        centralizar();
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
        setLocation((screen.width - (janela.width))/2,
            (screen.height - janela.height) / 2);
    }

    public JLabel criarLabel(String texto) {
        JLabel l1 = new JLabel(texto);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        add(l1);
        return l1;
    }

    public JTextField criarTextField(){
        JTextField jt = new JTextField();
        jt.setHorizontalAlignment(SwingConstants.CENTER);
        jt.setFont(new Font("Arial", Font.PLAIN, 18));
        add(jt);
        return jt;
    }

    public JButton criarButton(String texto) {
        JButton b1 = new JButton(texto);
        b1.addActionListener(this);
        b1.setFont(new Font("Arial", Font.BOLD, 24));
        add(b1);
        return b1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            String nome = nomeField.getText();
            double nota = Double.parseDouble(notaField.getText());
            nomeField.setText("");
            notaField.setText("");
            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO aluno (alunoNome, alunoNota) values(?,?)");
                ps.setString(1,nome);
                ps.setDouble(2, nota);
                ps.executeUpdate();
                System.out.println("Aluno cadastrado com sucesso.");
                ps.close();
            } catch (Exception a) {
                System.out.println("Falha ao realizar a operação");
                a.printStackTrace();
            }
        }
        if(e.getSource() == cancelar){
            nomeField.setText("");
            notaField.setText("");
        }
    }
}
