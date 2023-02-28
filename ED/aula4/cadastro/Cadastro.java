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
    Array.inserir(new Pessoa("Jarge", 40));
    Array.inserir(new Pessoa("Jarge", 40));
    Array.inserir(new Pessoa("Jarge", 40));
    Array.inserir(new Pessoa("Jarge", 40));
    Array.inserir(new Pessoa("Jarge", 40));
    Array.mostrar();
    System.out.println("=== Pesquisando... ===");
    int id = 187;
    Pessoa p = Array.buscar(id);
    if(p != null){
      System.out.println(p);
    }
    else{
      System.out.println("Não achei o "+id);
    }
  }

}
