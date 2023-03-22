package Aula7.Banco;

public class AcessaBanco {
    private String login;
    private boolean conectado;

    public AcessaBanco(){

    }

    public AcessaBanco(String login){
        this.login = login;
        conectado = false;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isConectado() {
        return this.conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

}
