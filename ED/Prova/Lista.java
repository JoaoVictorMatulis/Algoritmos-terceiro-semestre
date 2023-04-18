/*  =======================================
 *      Prova Estrutura de Dados - 11/04
 *                Turma A
 *   João Victor Matulis - ID: 1142445416
 * 
 *   Gabriel de Melo Silva - ID: 1141267353
 *  =======================================
 */
package Prova;

public class Lista {

    private Elemento inicio, atual, aux;
    private int valor = 1;

    /**
     * Verifica se a lista está vazia
     * @return boolean
     */
    public boolean vazio() {
        return inicio == null;
    }

    /**
     * Insere um contato para a lista
     * 
     * @param objeto Object
     */
    public void inserir(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(valor++);
        if (vazio()) {
            inicio = new Elemento(null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    /**
     * Insere elementos na lista encadeada a partir do início
     * @param objeto
     */
    public void inserirInicio(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(valor++);
        if (vazio()) {
            inicio = new Elemento(null, objeto);
            aux = inicio;
        } else {
            Elemento novoInicio = new Elemento(null, objeto);
            novoInicio.setProx(inicio);
            inicio = novoInicio;
        }
    }
    /**
     * Exibe o conteúdo da lista encadeada
     */
    public void mostrar() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    /**
     * Conta e imprime o total de elementos na lista encadeada
     */
    public void totalElemento() {
        int contador = 0;
        if(inicio != null){
            Elemento e = inicio;
            while (e != null) {
                contador++;
                e = e.getProx();
            }
        }
        if(contador > 0){
            System.out.println("\nTotal de elementos na lista são: "+contador);
        }else{
            System.out.println("\nA lista está vazia");
        }
    }
}