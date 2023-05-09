/*
 * Turma: A
    Autores: João Victor Matulis || Id de aluno: 1142445416
            Bernardo Galvão de Souza || Id de aluno: 1142473154
            Gabriel de Melo Silva || Id de aluno: 1141267353
            Kevin de Sousa dos Santos || Id de aluno: 1142168549

    Professor: Carlos Veríssimo
 */
package Controller;

import javax.swing.JOptionPane;

import Model.ConectarBD;
import View.Morador.MoradorView;

public class Iniciar {
    public Iniciar(){
        new ConectarBD();
        new MoradorView();
        JOptionPane.showMessageDialog(null,"BOTÕES EM CINZA NÃO ESTÃO FUNCIONAIS\n(NÃO TEM COMUNICAÇÃO COM O BANCO DE DADOS)\nPROPOSITO MERAMENTE ILUSTRATIVO");
    }
}