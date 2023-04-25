/*
 * Autores: João Victor Matulis       id:1142445416
 *          Bernardo Galvão de Souza  id:1142473154
 * 
 * Professor: Gerson Risso
 */
package listaFila;

public class Fila {

  Elemento inicio, atual, aux;

  
  /**
   * Insere um novo elemento na lista duplamente ligada
   * @param objeto Object
   */
  public void enqueue(Object objeto) {
    if (empty()) {// lista vazia
      inicio = new Elemento(null, null, objeto);
      aux = inicio;
    } else {
      atual = new Elemento(null, aux, objeto);
      aux.setProx(atual);
      aux = atual;
    }
  }
  
  /**
   * Remove o primeiro elemento da pilha/lista duplamente encadeada
   * @return boolean
   */
  public boolean dequeue() {
    if(empty()){
      return false;
    }
    if(size()>1){
      Elemento e = inicio.getProx();
      inicio.setProx(null);
      e.setAnt(null);
      inicio = e;
    }else{
      inicio = null;
    }
    return true;
  }
  
  /**
   * Verifica se a pilha/lista duplamente encadeada está vazia
   * @return boolean
   */
  public boolean empty() {
    return inicio == null;
  }

  /**
   * Retorna o primeiro elemento da pilha/lista duplamente encadeada
   * @return Object
   */
  public Object front(){
    return inicio.getObjeto();
  }

  /**
     * Conta e retorna o total de elementos na pilha/lista duplamente encadeada
     * @return int
     */
    public int size() {
      int contador = 0;
      if(inicio != null){
          Elemento e = inicio;
          while (e != null) {
              contador++;
              e = e.getProx();
          }
      }
      return contador;
  }
}