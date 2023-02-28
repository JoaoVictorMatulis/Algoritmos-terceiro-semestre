package cadastro;

/*
 *  Professor Gerson Risso
 */
public class Array {
  private static Pessoa[] lista = new Pessoa[3];
  private static int indice = 0;

  /**
   * Insere objectos do tipo Pessoa em um
   * array definido.
   * 
   * @param p Pessoa
   */
  public static void inserir(Pessoa p) {
    if(indice < lista.length){
      p.setId(indice + 1);
      lista[indice++] = p;
    }
    else{
      lista = alocarNovoArray();
      inserir(p);
    }
  }

  private static Pessoa[] alocarNovoArray(){
    Pessoa[] novo = new Pessoa[lista.length + 4];
    System.arraycopy(lista, 0, novo, 0, lista.length);
    return novo;
  }

  /**
   * Exibe o conte�do relevante do array.
   */
  public static void mostrar() {
    for (int i = 0; i < indice; i++) {
      System.out.println(lista[i]);
    }
  }

  /**
   * Realiza a busca, por id, de um objeto no vetor lista
   * @param id int
   * @return Pessoa
   */

  public static Pessoa buscar(int id) {
    int inicio = 0, fim = indice-1, meio;
    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (id == lista[meio].getId()) {
        return lista[meio];
      }
      else if (id > lista[meio].getId()) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }
    return null;
  }
}
