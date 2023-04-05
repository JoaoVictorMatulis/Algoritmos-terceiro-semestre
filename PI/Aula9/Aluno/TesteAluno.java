package Aula9.Aluno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> objetos = new ArrayList<Aluno>();
        boolean desligar = false;
        String itens[] = { "Inserir aluno", "Desligar" };
        while (desligar != true) {
            int escolha = JOptionPane.showOptionDialog(null, "Gerenciamento de alunos", "Escola",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if (escolha == 0) {
                String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                String ra = JOptionPane.showInputDialog("Digite o registro do aluno");
                ;
                float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
                float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
                objetos.add(new Aluno(nome, ra, nota1, nota2));
            } else {
                desligar = true;
            }
        }
        for (Aluno i : objetos) {
            System.out.println(i);
        }
    }
}
