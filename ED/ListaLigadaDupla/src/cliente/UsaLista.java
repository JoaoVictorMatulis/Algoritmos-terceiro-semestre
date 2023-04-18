package cliente;

import lista.*;

/*
*  Professor Gerson Risso
 */
public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Mel", "1234-5555"));
        lista.inserir(new Contato("Gaia", "3456-5678"));
        lista.inserir(new Contato("Tonica", "4568-5695"));
        lista.inserir(new Contato("Gaia", "3456-5678"));
        lista.inserir(new Contato("Gaia", "3456-5678"),5);
        //lista.mostrar();
        lista.exibir(Modo.ESQUERDADIREITA);
        //System.out.println("Conte�do da lista");
        /*System.out.println("Pesquisando...");
        Elemento e = lista.pesquisar(5);
        if (e != null) {
            System.out.println(e.getObjeto());
        } else {
            System.out.println("N�o achei!!");
        }

        System.out.println("Removendo...");
        if (lista.remover(50)) {
            System.out.println("Removido!");
        } else {
            System.out.println("N�o removido!!");
        }
        lista.exibir(Modo.ESQUERDA);*/
    }

}
