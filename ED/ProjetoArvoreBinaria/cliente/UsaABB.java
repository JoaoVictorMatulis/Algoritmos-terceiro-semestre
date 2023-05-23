package ProjetoArvoreBinaria.cliente;

import ProjetoArvoreBinaria.abb.Arvore;

public class UsaABB {
    public static void main(String[] args) {
        Arvore a = new Arvore();
        a.inserir(34);
        a.inserir(4);
        a.inserir(12);
        a.inserir(57);
        a.inserir(8);
        a.inserir(10);
        a.inserir(55);
        a.inserir(15);
        a.inserir(27);
        a.inserir(19);
        a.inserir(2);
        a.inserir(46);
        System.out.print("Pré-ordem: ");
        a.preordem(a.getRaiz());
        System.out.print("\nOrdem: ");
        a.ordem(a.getRaiz());
        System.out.print("\nPós-ordem: ");
        a.posordem(a.getRaiz());
        System.out.println("\n"+a.pesquisar(a.getRaiz(), 10));
        System.out.println(a.grau(a.getRaiz(), 34));
        a.remover(a.getRaiz(), 10);
        System.out.print("\nOrdem: ");
        a.ordem(a.getRaiz());
        System.out.println("\n"+a.getAltura(a.getRaiz()));
    }
}
