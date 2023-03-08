package Pessoa;
public class PessoaJuridica extends Pessoa{
    
    private String cnpj, ie;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String ie) {
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String ie) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString()+"PessoaJuridica [cnpj=" + cnpj + ", ie=" + ie + "]";
    }

    
}