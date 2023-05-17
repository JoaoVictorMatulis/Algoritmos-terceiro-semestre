import java.sql.*;

public class ExemploPreparedStatement {
    public static void main(String[] args) {
        try {
            Connection cn = ConectaBanco.getConexao("root", "P@$$w0rd");
            PreparedStatement ps = cn.prepareStatement("INSERT INTO aluno (alunoNome, alunoNota) values(?,?)");
            ps.setString(1,"Manuel");
            ps.setDouble(2, 10);
            ps.executeUpdate();
            System.out.println("Aluno cadastrado com sucesso.");
            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");
        } catch (Exception e) {
            System.out.println("Falha ao realizar a operação");
            e.printStackTrace();
        }
    }
}
