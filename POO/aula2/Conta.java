package aula2;
public class Conta{

    private int agencia;
    private int conta;
    private String senha;
    private double saldo;

    public Conta(){
        
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double deposito) {
        this.saldo += deposito;
    }
    public void saque(double saque) {
        this.saldo -= saque;
    }
}
