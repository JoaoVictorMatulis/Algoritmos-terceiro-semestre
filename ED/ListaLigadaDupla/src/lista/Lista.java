package lista;

/*
 *  Professor Gerson Risso
 */
public class Lista {

  Elemento inicio, atual, aux;

  public boolean verificar() {
    return inicio == null;
  }

  public void inserir(Object objeto) {
    if (verificar()) {// lista vazia
      inicio = new Elemento(null, null, objeto);
      aux = inicio;
    } else {
      atual = new Elemento(null, aux, objeto);
      aux.setProx(atual);
      aux = atual;
    }
  }

  public void inserir(Object objeto, int posicao) {
    if(verificar()){
      inicio = new Elemento(null, null, objeto);
      aux = inicio;
    }else{
      int totalElemento = totalElemento();
      if(posicao <= 1){
        Elemento e = new Elemento(inicio, null, objeto);
        inicio.setAnt(e);
        inicio = e;
      }else if(posicao > totalElemento){
        Elemento e = new Elemento(null, aux, objeto);
        aux.setProx(e);
        aux = e;
        atual = e;
      }else{
        Elemento auxBusca = inicio;
        for(int i = 1; i < posicao-1; i++){
          auxBusca = auxBusca.getProx();
        }
        Elemento e = new Elemento(auxBusca.getProx(), auxBusca, objeto);
        auxBusca.getProx().setAnt(e);
        auxBusca.setProx(e);
      }
    }
  }

  /**
     * Conta e imprime o total de elementos na lista encadeada
     */
    public int totalElemento() {
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

  public void exibir(Modo modo) {
    Elemento e;
    if (modo.equals(Modo.ESQUERDADIREITA)) {
      e = inicio;
      while (e != null) {
          System.out.println(e.getObjeto());
          e = e.getProx();
      }
    } else {
      e = atual;
      while (e != null) {
        System.out.println(e.getObjeto());
        e = e.getAnt();
      }
    }
  }

  public void mostrar() {
    Elemento e = inicio;
    while (e != null) {
        System.out.println(e.getObjeto());
        e = e.getProx();
    }
 
  }
  public Elemento pesquisar(int id) {
    Elemento e = inicio;
    Contato c;
    while (e != null) {
      c = (Contato) e.getObjeto();// Cast
      if (id == c.getId()) {
        return e;
      }
      e = e.getProx();
    }
    return null;
  }

  public boolean remover(int id) {
    Elemento e = pesquisar(id);
    if (e != null) {
      if (e == inicio) {
        inicio = inicio.getProx();
        inicio.setAnt(null);
        e.setProx(null);
      } else if (e == atual) {
        atual = e.getAnt();
        aux = atual;
        aux.setProx(null);
        e.setAnt(null);
      } else {
        e.getAnt().setProx(e.getProx());
        e.getProx().setAnt(e.getAnt());
        e.setProx(null);
        e.setAnt(null);
      }
      return true;
    }
    return false;
  }

}