/*
 * Autor: João Victor Matulis 
 * email: jvmatulis@gmail.com
 * Id: 1142445416
 * 
 * Professor: Carlos Veríssimo
 * email: carlos.hvpereira@sp.senac.br
*/
package ADO3;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{

    public Aluno() {
    }
    
    @Override
    public void enviarEmail(){
        JOptionPane.showMessageDialog(null, "Solicitando a presença do aluno na secretaria");
    }
}