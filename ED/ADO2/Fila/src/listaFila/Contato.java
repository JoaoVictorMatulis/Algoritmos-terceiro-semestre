/*
 * Autores: João Victor Matulis       id:1142445416
 *          Bernardo Galvão de Souza  id:1142473154
 * 
 * Professor: Gerson Risso
 */
package listaFila;

public class Contato {
  private String nome;
  private String cel;
  private int id;
  private static int valor=1;

    public Contato() {
    }

    public Contato(String nome, String cel) {
        this.nome = nome;
        this.cel = cel;
        this.id=valor++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", cel=" + cel + ", id=" + id + '}';
    }
  
}
