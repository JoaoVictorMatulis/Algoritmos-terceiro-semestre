/*
 * Auto: João Victor Matulis 
 * email: jvmatulis@gmail.com
 * Id: 1142445416
 * 
 * Professor: Carlos Veríssimo
 * email: carlos.hvpereira@sp.senac.br
*/
public class Conta {

    private String usuario, senha;

    public Conta() {
    }

    public Conta(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
