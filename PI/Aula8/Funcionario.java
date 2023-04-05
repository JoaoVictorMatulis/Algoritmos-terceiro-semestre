package Aula8;

public class Funcionario {
    private String nome,fone;

    public Funcionario() {
    }

    public Funcionario(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }


    @Override
    public boolean equals(Object o){
        if(o instanceof Funcionario){
            Funcionario f = (Funcionario) o;
            if(this.getNome().equals(f.getNome()) && this.getFone().equals(f.getFone())){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.getFone().hashCode() + this.getNome().hashCode());
    }
    
}
