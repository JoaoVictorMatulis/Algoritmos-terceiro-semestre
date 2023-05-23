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

    public Elemento pesquisar(Elemento e, int n) {
        if (e != null) {
            if (n == e.getNumero()) {
                return e;
            } else if (n >= e.getNumero()) {
                return pesquisar(e.getDir(), n);
            } else {
                return pesquisar(e.getEsq(), n);
            }
        }
        return null;
    }

    public Elemento getMaior(Elemento e) {
        if (e.getDir() != null) {
            return getMaior(e.getDir());
        }
        return e;
    }

    public int grau(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);
        if (pesq != null) {
            if (pesq.getDir() == null && pesq.getEsq() == null) {
                return 0;
            }
            if (pesq.getDir() != null && pesq.getEsq() != null) {
                return 2;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public void remover(Elemento e, int n) {
        Elemento pesq = pesquisar(e, n);
        if (pesq != null) {
            if (grau(e, n) == 0) {
                if (pesq.getRaiz().getDir() == pesq) {
                    pesq.getRaiz().setDir(null);
                    pesq.setRaiz(null);
                } else {
                    pesq.getRaiz().setEsq(null);
                    pesq.setRaiz(null);
                }
            }
        } else if (grau(e, n) == 1) {
            if (pesq.getDir() != null) {
                pesq.setNumero(pesq.getDir().getNumero());
                remover(pesq.getDir(), pesq.getDir().getNumero());
            } else {
                pesq.setNumero(pesq.getEsq().getNumero());
                remover(pesq.getEsq(), pesq.getEsq().getNumero());
            }             
        }else{
            Elemento maior = getMaior(pesq.getEsq());
            pesq.setNumero(maior.getNumero());
            remover(pesq.getEsq(), maior.getNumero());
        }
    }

    public void preordem(Elemento e) {
        System.out.print(e);
        if (e.getEsq() != null)
            preordem(e.getEsq());
        if (e.getDir() != null)
            preordem(e.getDir());
    }

    public void posordem(Elemento e) {
        if (e.getEsq() != null) {
            posordem(e.getEsq());
        }
        if (e.getDir() != null) {
            posordem(e.getDir());
        }
        System.out.print(e);
    }

    public void ordem(Elemento e) {
        if (e.getEsq() != null) {
            ordem(e.getEsq());
        }
        System.out.print(e);
        if (e.getDir() != null) {
            ordem(e.getDir());
        }
    }

    public int getAltura(Elemento e){
        if(e == null){
            return -1;
        }
        int esquerda = getAltura(e.getEsq());
        int direita = getAltura(e.getDir());

        if(esquerda > direita){
            return esquerda+1;
        }else{
            return direita+1;
        }
    }

    public Elemento getRaiz() {
        return this.raiz;
    }
}
