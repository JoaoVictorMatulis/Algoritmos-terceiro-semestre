package ProjetoArvoreBinaria.abb;

public class Elemento {
    private Elemento raiz;
    private Elemento esq;
    private Elemento dir;
    private int n;

    public Elemento(){
    }

    public Elemento(int n){
        this.n = n;
    }

    public Elemento getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Elemento raiz) {
        this.raiz = raiz;
    }

    public Elemento getEsq() {
        return this.esq;
    }

    public void setEsq(Elemento esq) {
        this.esq = esq;
    }

    public Elemento getDir() {
        return this.dir;
    }

    public void setDir(Elemento dir) {
        this.dir = dir;
    }

    public int getNumero() {
        return this.n;
    }

    public void setNumero(int n) {
        this.n = n;
    }


    @Override
    public String toString() {
        return n+", ";
    }

}
