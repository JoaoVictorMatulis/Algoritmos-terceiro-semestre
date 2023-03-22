package Aula7.Banco;

import javax.swing.JOptionPane;

public class ClienteBanco {
    private String nome;
    private String CPF;
    private String endereco;

    public ClienteBanco() {
    }

    public ClienteBanco(String nome, String cPF, String endereco) {
        this.nome = nome;
        CPF = cPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "O Sr." +nome+ " portador do CPF n."+CPF+ " residente e domiciliado a " +endereco+" vem por meio desta solicitar o encerramento de sua conta corrente";
    }

    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String CPF = JOptionPane.showInputDialog("Digite seu CPF");
        String endereco = JOptionPane.showInputDialog("Digite seu endereço");
        ClienteBanco cliente = new ClienteBanco(nome,CPF,endereco);
        JOptionPane.showMessageDialog(null, cliente);
    }

}
