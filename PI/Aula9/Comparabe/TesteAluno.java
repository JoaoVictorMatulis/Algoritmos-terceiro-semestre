package Aula9.Comparabe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Orlando", 123);
        Aluno aluno2 = new Aluno("Rafael", 258);
        Aluno aluno3 = new Aluno("Amanda", 642);
        Aluno aluno4 = new Aluno("Bruna", 634);
        Aluno aluno5 = new Aluno("Orlando", 345);
        Aluno aluno6 = new Aluno("Rafaela", 942);
        Aluno aluno7 = new Aluno("Amanda", 650);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        System.out.println("Imprimindo alunos antes da ordenação");
        Iterator<Aluno> iTer1 = alunos.iterator();
        while (iTer1.hasNext()) {
            System.out.println(iTer1.next());
        }
        Collections.sort(alunos);
        System.out.println("\nImprimindo alunos depois da ordenação");
        Iterator<Aluno> iTer2 = alunos.iterator();
        while (iTer2.hasNext()) {
            System.out.println(iTer2.next());
        }
    }
}
