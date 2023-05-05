/*
 * Turma: A
    Autores: João Victor Matulis || Id de aluno: 1142445416
            Bernardo Galvão de Souza || Id de aluno: 1142473154
            Gabriel de Melo Silva || Id de aluno: 1141267353
            Kevin de Sousa dos Santos || Id de aluno: 1142168549

    Professor: Carlos Veríssimo
 */
package Model;

import java.sql.ResultSet;

public class MoradorDAO {
    public boolean validacao(String senha) {
        try {
            String minhaquery = "select id_pessoa, senha from pessoa where senha = '" + senha + "';";
            ResultSet result = ConectarBD.stm.executeQuery(minhaquery);
            if (result.next()) {
                String id = result.getString("id_pessoa");
                minhaquery = "select * from registros where fk_id_pessoa = '" + id + "'and saida is null;";
                result = ConectarBD.stm.executeQuery(minhaquery);
                if(result.next() && setVazio(result.getString("saida"))){
                    id = result.getString("id_registro");
                    minhaquery = "update registros set saida = now() where id_registro = '"+id+"';";
                    ConectarBD.stm.executeUpdate(minhaquery);
                    System.out.println("oi");

                }else{
                    minhaquery = "insert into registros(fk_id_pessoa, saida) value('"+id+"',null);";
                    ConectarBD.stm.executeUpdate(minhaquery);
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro na Inclusao: " + e.getMessage());
        }
        return false;
    }

    private static Boolean setVazio(String result){
        if(result == null){
            return true;
        }
        return false;
    }
}
