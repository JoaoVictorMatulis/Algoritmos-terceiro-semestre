import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ExemploResultSet {
    public static void main(String[] args) {
        try{
            Connection cn = ConectaBanco.getConexao("root", "P@$$w0rd");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM aluno");
            while(rs.next()){
                String nome = rs.getString("alunoNome");
                double nota = rs.getDouble("alunoNota");
                System.out.println("Nome: "+nome+" Nota: "+nota);
            }
        }catch(SQLException e){
            System.out.println("Falha ao realizar a operação");
            e.printStackTrace();
        }
    }
}