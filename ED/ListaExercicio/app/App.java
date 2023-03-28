package ListaExercicio.app;

import javax.swing.JOptionPane;

import ListaExercicio.lista.*;

public class App {
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.inserir(new Produto("Fini","Doce",100));
        lista.inserir(new Produto("Chocolate","Doce",100));
        lista.inserir(new Produto("Batata Frita","Frito",3.99f));
        lista.inserir(new Produto("Patinho","Carne",3.99f));
        lista.inserir(new Produto("Coxinha","Frito",3.99f));
        JOptionPane.showMessageDialog(null, lista.mostrarJOptionPane());
        Object a = lista.pesquisar(3)[0];
        if (a == null) {
            System.out.println("Não achei");
        } else {
            System.out.println("\n" + a);
        }
        System.out.println();
        if (lista.remover("Patinho")) {
            System.out.println("Removeu\n");
        } else {
            System.out.println("Não removeu\n");
        }
        lista.desconto("Doce", 25);
        lista.mostrar();
    }
}
