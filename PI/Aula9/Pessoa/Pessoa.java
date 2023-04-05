package Aula9.Pessoa;

public class Pessoa {
    private String nome,cpf;


    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pessoa) {
            Pessoa f = (Pessoa) o;
            if (this.getCpf().equals(f.getCpf())){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.getCpf().hashCode());
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            "}";
    }

}
