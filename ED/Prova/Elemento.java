/*  =======================================
 *      Prova Estrutura de Dados - 11/04
 *                Turma A
 *   João Victor Matulis - ID: 1142445416
 * 
 *   Gabriel de Melo Silva - ID: 1141267353
 *  =======================================
 */
package Prova;

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