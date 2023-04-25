/*
 * Autores: João Victor Matulis       id:1142445416
 *          Bernardo Galvão de Souza  id:1142473154
 * 
 * Professor: Gerson Risso
 */
package cliente;

import javax.swing.JOptionPane;

import listaFila.*;

public class UsaLista {
    static private Pilha pilha = new Pilha();
    static private Fila fila = new Fila();
    
    public static void main(String[] args) {
        boolean desligar = false;
        String itens[] = { "Fila", "Pilha", "Desligar"};
        while (desligar != true) {
            int escolha = JOptionPane.showOptionDialog(null, "Menu", "APP",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if(escolha == 0){
                fila();
            }
            else if(escolha == 1){
                pilha();
            }else{
                desligar = true;
            }
        }
    }

    public static void pilha(){
        boolean desligar = false;
        String itens[] = { "Inserir Elemento", "Remover Elemento", "Verificar se a pilha está vazia", "Mostra o ultimo elemento", "Tamanho da Pilha", "Menu"};
        while (desligar != true) {
            int escolha = JOptionPane.showOptionDialog(null, "Gerenciamento de pilha", "Pilha",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if(escolha == 0){
                String nome = JOptionPane.showInputDialog(null,"Digite um nome"); 
                String cel = JOptionPane.showInputDialog(null,"Digite um numero de celular");
                pilha.push(new Contato(nome,cel));
            }
            if(escolha == 1){
                if(pilha.pop()){
                    JOptionPane.showMessageDialog(null,"Ultimo elemento removido com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,"Pilha está vazia");
                }
            }
            if(escolha == 2){
                if(pilha.empty()){
                    JOptionPane.showMessageDialog(null,"Pilha está vazia");
                }else{
                    JOptionPane.showMessageDialog(null,"Pilha não está vazia");
                }
            }
            if(escolha == 3){
                if(pilha.empty()){
                    JOptionPane.showMessageDialog(null,"Pilha está vazia");
                }else{
                    JOptionPane.showMessageDialog(null,pilha.top());  
                }
            }
            if(escolha == 4){
                JOptionPane.showMessageDialog(null, "Quantidade de elementos na pilha: "+pilha.size());
            }
            if(escolha == 5){
                desligar = true;
            }
        }
    }

    public static void fila(){
        boolean desligar = false;
        String itens[] = { "Inserir Elemento", "Remover Elemento", "Verificar se a lista está vazia", "Mostra o primeiro elemento", "Tamanho da lista", "Menu"};
        while (desligar != true) {
            int escolha = JOptionPane.showOptionDialog(null, "Gerenciamento de fila", "Fila",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
            if(escolha == 0){
                String nome = JOptionPane.showInputDialog(null,"Digite um nome"); 
                String cel = JOptionPane.showInputDialog(null,"Digite um numero de celular");
                fila.enqueue(new Contato(nome,cel));
            }
            if(escolha == 1){
                if(fila.dequeue()){
                    JOptionPane.showMessageDialog(null,"Primeiro elemento removido com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,"Lista está vazia");
                }
            }
            if(escolha == 2){
                if(fila.empty()){
                    JOptionPane.showMessageDialog(null,"Lista está vazia");
                }else{
                    JOptionPane.showMessageDialog(null,"Lista não está vazia");
                }
            }
            if(escolha == 3){
                if(fila.empty()){
                    JOptionPane.showMessageDialog(null,"Lista está vazia");
                }else{
                    JOptionPane.showMessageDialog(null,fila.front());  
                }
            }
            if(escolha == 4){
                JOptionPane.showMessageDialog(null, "Quantidade de elementos na lista: "+fila.size());
            }
            if(escolha == 5){
                desligar = true;
            }
        }
    }

}
