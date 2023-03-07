package cadastro;

/*
*  Professor Gerson Risso
*/
public class Cadastro {

  public static void main(String[] args) {
    Array.inserir(new Pessoa("Gerson", 35));
    Array.inserir(new Pessoa("Sandra", 30));
    Array.inserir(new Pessoa("Jorge", 30));
    Array.inserir(new Pessoa("Jarge", 40));
    Array.inserir(new Pessoa("Aarge", 40));
    Array.inserir(new Pessoa("Darge", 40));
    Array.inserir(new Pessoa("CAlarge", 40));
    Array.inserir(new Pessoa("Awarge", 40));
    Array.inserir(new Pessoa("Terarge", 40));
    Array.mostrar();
    System.out.println("\n=== Pesquisando ===\n");
    int id = 9;
    int p = Array.buscar(id);
    if (p != -1) {
      Array.mostrarId(id);
    } else {
      System.out.println("Não achei o id:" + id);
    }
    System.out.println("\n=== Removendo ===\n");
    if (Array.remover(id)) {
      Array.mostrar();
      System.out.println("\nCadastro removido com sucesso.\n");
    } else {
      System.out.println("Não foi possível achar esse cadastro.");
    }
  }

}
