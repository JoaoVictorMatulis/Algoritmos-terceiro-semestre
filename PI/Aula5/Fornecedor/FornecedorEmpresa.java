package Fornecedor;

public class FornecedorEmpresa extends Fornecedor {
    private String IE, CNPJ;

    public FornecedorEmpresa() {
    }

    public FornecedorEmpresa(String nome, String fone, String iE, String cNPJ) {
        super(nome, fone);
        IE = iE;
        CNPJ = cNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String iE) {
        IE = iE;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFornecedorEmpresa [IE=" + IE + ", CNPJ=" + CNPJ + "]\n";
    }

    
}