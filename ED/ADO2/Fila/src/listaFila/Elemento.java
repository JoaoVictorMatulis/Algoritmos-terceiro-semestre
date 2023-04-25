/*
 * Autores: João Victor Matulis       id:1142445416
 *          Bernardo Galvão de Souza  id:1142473154
 * 
 * Professor: Gerson Risso
 */
package listaFila;

public class Elemento {
  private Elemento prox,ant;
  private Object objeto;

    public Elemento(Elemento prox, Elemento ant, Object objeto) {
        this.prox = prox;
        this.ant=ant;
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Elemento getAnt() {
        return ant;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
  
}
