package Model;

import java.sql.*;

public class MoradorDAO {
    ConectarBD cbd = new ConectarBD(); 
    Statement stm = cbd.getStatement();
    private ResultSet result = null;
    
    public void listar() {
        try {
            String minhaQuery = "SELECT * FROM aluno ORDER BY nome";
            result = stm.executeQuery(minhaQuery);
            while (this.result.next()) {
                System.out.println("ID: "+result.getString("id") + " - Nome: "+this.result.getString("nome") );
            }
        } catch(Exception e) {
            System.out.println("Erro na lista: "+ e.getMessage());
        }
    }

    public void verificarSenha(){
        
    }
}
