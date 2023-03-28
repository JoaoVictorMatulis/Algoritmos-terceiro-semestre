package ListaEncadeada.cliente;

import ListaEncadeada.lista.*;

public class UsaCliente {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("João", "12314512"));
        lista.inserir(new Contato("Lucas", "16345121"));
        lista.inserir(new Contato("Leo", "580232344"));
        lista.inserir(new Contato("Ana", "5923422"));
        lista.inserir(new Contato("Pedro", "5923422"));
        lista.mostrar();
        Object a = lista.pesquisar(3)[0];
        if (a == null) {
            System.out.println("Não achei");
        } else {
            System.out.println("\n" + a);
        }
        System.out.println();
        if (lista.remover(3)) {
            System.out.println("Removeu\n");
        } else {
            System.out.println("Não removeu\n");
        }
        lista.mostrar();
    }
}
