package ListaEncadeada.cliente;

import ListaEncadeada.lista.*;

public class UsaCliente {
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.inserir(new Contato("João","12314512"));
        lista.inserir(new Contato("Lucas","16345121"));
        lista.inserir(new Contato("Leo","580232344"));
        lista.inserir(new Contato("Ana","5923422"));
        lista.mostrar();
    }
}
