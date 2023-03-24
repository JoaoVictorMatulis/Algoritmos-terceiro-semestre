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

public class Professor extends Pessoa{

    public Professor() {
    }
    
    @Override
    public void enviarEmail(){
        JOptionPane.showMessageDialog(null, "Informando período de férias para o professor");
    }
}
