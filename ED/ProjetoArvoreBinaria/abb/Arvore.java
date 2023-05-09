package ProjetoArvoreBinaria.abb;

public class Arvore {
    private Elemento raiz;
    private Elemento atual;

    public void inserir(int num) {
        if (raiz == null) {
            raiz = new Elemento(num);
        } else {
            atual = new Elemento(num);
            inserirRecursivo(atual, raiz);
        }
    }

    private void inserirRecursivo(Elemento atual, Elemento e) {
        if (atual.getNumero() >= e.getNumero()) {
            if (e.getDir() == null) {
                e.setDir(atual);
                atual.setRaiz(e);
            } else {
                inserirRecursivo(atual, e.getDir());
            }
        } else {
            if (e.getEsq() == null) {
                e.setEsq(atual);
                atual.setRaiz(e);
            } else {
                inserirRecursivo(atual, e.getEsq());
            }
        }
    }

    public void preordem(Elemento e){
        System.out.print(e);
        if(e.getEsq()!=null)
            preordem(e.getEsq());
        if(e.getDir()!=null)
            preordem(e.getDir());
    }

    public void posordem(Elemento e){
        if(e.getEsq()!=null){
            posordem(e.getEsq());
        }
        if(e.getDir()!=null){
            posordem(e.getDir());
        }
        System.out.print(e);
    }

    public void ordem(Elemento e ){
        if(e.getEsq()!=null){
            ordem(e.getEsq());
        }
        System.out.print(e);
        if(e.getDir()!=null){
            ordem(e.getDir());
        }
    }

    public Elemento getRaiz() {
        return this.raiz;
    }
}
