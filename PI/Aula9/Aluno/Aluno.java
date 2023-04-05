package Aula9.Aluno;

public class Aluno {
    private String nome, ra;
    private float nota1, nota2;

    public Aluno() {
    }

    public Aluno(String nome, String ra, float nota1, float nota2) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aluno) {
            Aluno f = (Aluno) o;
            if (this.getNome().equals(f.getNome()) && this.getRa().equals(f.getRa()) && this.getNota1() == f.getNota1()
                    && this.getNota2() == f.getNota2()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", ra='" + getRa() + "'" +
                ", nota1='" + getNota1() + "'" +
                ", nota2='" + getNota2() + "'" +
                "}\n";
    }

}
