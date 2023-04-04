package ListaEncadeadaDupla.app;

import javax.swing.JOptionPane;

import ListaEncadeadaDupla.lista.*;

public class App2 {
    public static void main(String[] args) {
        Lista2 lista = new Lista2();
        Object selectedValue;
        do{
            Object[] escolhas = { "Adicionar Produto", "Mostrar todos os produtos", "Remover Produto por id","Atulizar Produto por id", "Desligar Programa"};
            selectedValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectedValue != "Desligar Programa"){
                switch((String)selectedValue){
                    case "Adicionar Produto":
                        inserirProduto(lista);
                        break;
                    case "Mostrar todos os produtos":
                        lista.mostrar(Modo.DIREITA);
                        break;
                    case "Remover Produto por id":
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do produto"));
                        if(lista.remover(id)){
                            JOptionPane.showMessageDialog(null,"Removido com sucesso");
                        }else{
                            JOptionPane.showMessageDialog(null,"Não foi possível achar esse id");
                        }
                        break;
                    case "Atulizar Produto por id":
                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do produto"));
                        if(lista.atulizar(id)){
                            JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
                        }else{
                            JOptionPane.showMessageDialog(null,"Não foi possível achar esse id");
                        }
                        break;
                }
            }
        }while(selectedValue != "Desligar Programa");
    }

    public static void inserirProduto(Lista2 lista){
        String nome =JOptionPane.showInputDialog(null, "Digite o nome do produto");
        String categoria =JOptionPane.showInputDialog(null, "Digite a categoria do produto");
        double preco =Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto"));
        lista.inserir(new Produto(nome,categoria,preco));
    }
}   
/*
        lista.inserir(new Produto("Fini", "Doce", 100));
        lista.inserir(new Produto("Chocolate", "Doce", 100));
        lista.inserir(new Produto("Batata Frita", "Frito", 3.99f));
        lista.inserir(new Produto("Patinho", "Carne", 3.99f));
        lista.inserir(new Produto("Coxinha", "Frito", 3.99f));
        lista.mostrar(Modo.DIREITA);
        System.out.println();
        Elemento e = lista.pesquisar(-1);
        if(e!=null){
            System.out.println(e.getObjeto());
        }else{
            System.out.println("Não achei");
        }
        System.out.println();
        if(lista.remover(1)){
            System.out.println("Removido com sucesso");
        }else{
            System.out.println("Não achei");
        } */