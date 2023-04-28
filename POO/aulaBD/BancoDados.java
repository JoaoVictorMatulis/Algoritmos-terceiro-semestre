import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BancoDados {
    private Connection con = null;
    private Statement stm  = null;
    private ResultSet result = null;
    
    public void conecta() {
        String servidor = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String senha = "P@$$w0rd";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            this.con = DriverManager.getConnection(servidor, usuario, senha);
            this.stm = this.con.createStatement();
        } catch (Exception e) {
            System.out.println("erro na conexão : " + e.getMessage());
        }
    }
    public boolean estaConecatdo() {
        if (this.con != null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void listar() {
        try {
            String minhaQuery = "SELECT * FROM aluno ORDER BY nome";
            this.result = this.stm.executeQuery(minhaQuery);
            
            while (this.result.next()) {
                System.out.println("ID: "+this.result.getString("id") + " - Nome: "+this.result.getString("nome") );
            }
        } catch(Exception e) {
            System.out.println("Erro na lista: "+ e.getMessage());
        }
    }
    public void inserir(String nome) {
        try {
            String query = "INSERT INTO aluno (nome) VALUES('"+ nome +"');";
            this.stm.executeUpdate(query);
            System.out.println("Aluno " +nome + "Incuido com SUCESSO" );
            
        } catch(Exception e) {
            System.out.println("Erro na Inclusao: "+ e.getMessage());
        }
    }
    public void editar(String id, String nome) {
        try {
            String query = "UPDATE aluno SET nome ='"+ nome +"'  WHERE id = " + id + ";";
            this.stm.executeUpdate(query);
            System.out.println("ID: "+ id + " alterado com sucesso" );
        } catch(Exception e) {
            System.out.println("Erro na Alteracao: "+ e.getMessage());
        }
    }
    public void excluir(String id) {
        try {
            String query = "DELETE FROM aluno WHERE id = " + id + ";";
            this.stm.executeUpdate(query);
            System.out.println("ID: "+ id + "EXCLUIDO COM SUCESSO");
            
        } catch(Exception e) {
            System.out.println("Erro na Exclusao: "+ e.getMessage());
        }
    }
}