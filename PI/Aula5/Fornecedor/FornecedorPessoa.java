package Fornecedor;

public class FornecedorPessoa extends Fornecedor {
    private String RG, CPF;

    public FornecedorPessoa() {
    }

    public FornecedorPessoa(String nome, String fone, String rG, String cPF) {
        super(nome, fone);
        RG = rG;
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFornecedorPessoa [RG=" + RG + ", CPF=" + CPF + "]\n";
    }

    
}
