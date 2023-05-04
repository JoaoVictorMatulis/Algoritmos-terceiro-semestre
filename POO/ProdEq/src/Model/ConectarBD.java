package Model;
import java.sql.*;

public class ConectarBD {
    private Connection con = null;
    private static Statement stm  = null;

    public void conecta() {
        String servidor = "jdbc:mysql://localhost:3306/mydb";
        String usuario = "root";
        String senha = "P@$$w0rd";
        String driver = "com.mysql.cj.jdbc.Driver";
        //"com.mysql.jdbc.Driver"
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

    public Statement getStatement(){
        return stm;
    }
}
