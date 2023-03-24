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

public class Funcionario extends Pessoa{
    public Funcionario() {
    }
    
    @Override
    public void enviarEmail(){
        JOptionPane.showMessageDialog(null, "Convocando funcionario para fazer exame médico");
    }
}
