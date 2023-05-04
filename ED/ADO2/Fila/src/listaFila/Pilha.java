/*
 * Autores: João Victor Matulis       id:1142445416
 *          Bernardo Galvão de Souza  id:1142473154
 * 
 * Professor: Gerson Risso
 */
package listaFila;

public class Pilha {

  Elemento inicio, atual, aux;

  
  /**
   * Insere um novo elemento na lista duplamente ligada
   * @param objeto Object
   */
  public void push(Object objeto) {
    if (empty()) {// lista vazia
      inicio = new Elemento(null, null, objeto);
      aux = inicio;
      atual = inicio;
    } else {
      atual = new Elemento(null, aux, objeto);
      aux.setProx(atual);
      aux = atual;
    }
  }
  
  /**
   * Remove o ultimo elemento da pilha/lista duplamente encadeada
   * @return boolean
   */
  public boolean pop() {
    if(empty()){
      return false;
    }
    if(size()>1){
      aux = atual.getAnt();
      aux.setProx(null);
      atual.setAnt(null);
      atual = aux;
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
   * Retorna o ultimo elemento da pilha/lista duplamente encadeada
   * @return Object
   */
  public Object top(){
    return atual.getObjeto();
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