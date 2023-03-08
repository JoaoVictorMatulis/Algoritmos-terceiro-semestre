package Pessoa;
public class PessoaFisica extends Pessoa {

    private String rg, cpf;

    public PessoaFisica() {
        rg = null;
        cpf = null;
    }

    public PessoaFisica(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String telefone, String endereco, String rg, String cpf) {
        super(nome, telefone, endereco);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPessoaFisica [rg=" + rg + ", cpf=" + cpf + "]";
    }

    
}
