package Aula9.Exercicios.ex1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        lista.add(new Aluno("Jonas", "234", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Gustavo", "980", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Maria", "867", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Julia", "658", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Carlos", "086", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Eliane", "123", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Thomas", "354", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Julieta", "625", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Gabriel", "287", random.nextInt(10) + 1, random.nextInt(10) + 1));
        lista.add(new Aluno("Romeo", "987", random.nextInt(10) + 1, random.nextInt(10) + 1));
        boolean desligar = false;
        String itens[] = { "Remover aluno", "Desligar" };
        while (desligar != true) {
            int escolha = JOptionPane.showOptionDialog(null, "Gerenciamento de alunos", "Escola",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if (escolha == 0) {
                String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                for(int i = 0; i < lista.size(); i++){
                    if(nome.equals(lista.get(i).getNome())){
                        lista.remove(i);
                    }
                }
            } else {
                desligar = true;
            }
        }
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
        }
    }
}
