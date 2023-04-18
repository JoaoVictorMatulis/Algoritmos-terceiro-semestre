/*  =======================================
 *      Prova Estrutura de Dados - 11/04
 *                Turma A
 *   João Victor Matulis - ID: 1142445416
 * 
 *   Gabriel de Melo Silva - ID: 1141267353
 *  =======================================
 */
package Prova;

public class Contato {
    private String nome;
    private String cel;
    private int id;
    
    public Contato(){

    }

    public Contato(String nome, String cel){
        this.nome = nome;
        this.cel = cel;
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
        return "Contato [nome=" + nome + ", cel=" + cel + ", id=" + id + "]";
    }
}
