/*  =======================================
 *      Prova Estrutura de Dados - 11/04
 *                Turma A
 *   João Victor Matulis - ID: 1142445416
 * 
 *   Gabriel de Melo Silva - ID: 1141267353
 *  =======================================
 */
package Prova;

public class UsaCliente {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Kevin", "12314512"));
        lista.inserir(new Contato("Bernardo", "16345121"));
        lista.inserir(new Contato("Estevam", "580232344"));
        lista.mostrar();
        lista.totalElemento();
        System.out.println();
        lista.inserirInicio(new Contato("Lucas", "16345121"));
        lista.inserirInicio(new Contato("João", "12314512"));
        lista.inserirInicio(new Contato("Geraldo", "16345121"));
        lista.mostrar();

    }
}