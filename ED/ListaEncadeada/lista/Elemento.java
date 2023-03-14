package ListaEncadeada.lista;

public class Elemento {
    private Elemento prox;
    private Object objeto;

    public Elemento(Elemento prox, Object objeto){
        this.prox = prox;
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return this.prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Object getObjeto() {
        return this.objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
}