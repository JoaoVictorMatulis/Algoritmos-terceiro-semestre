package ListaExercicio.lista;

public class Elemento {
    private Elemento prox,ant;
    private Object objeto;


    public Elemento(Elemento prox, Elemento ant, Object objeto) {
        this.prox = prox;
        this.ant = ant;
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return this.prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Elemento getAnt() {
        return this.ant;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Object getObjeto() {
        return this.objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

}
