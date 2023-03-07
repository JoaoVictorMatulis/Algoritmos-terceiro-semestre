/*
 *  Autores:
 *      Nome:João Victor Matulis
 *          Id:1142445416
 *      Nome: Bernardo Galvão de Souza
 *          Id: 1142473154
 */
import javax.swing.JOptionPane;
public class Acesso {
    public static void main(String[] args){
        Object selectedValue;
        do{
            Object[] escolhas = { "Adicionar Livro", "Pesquisar Livro", "Remover Livro", "Desligar Programa"};
            selectedValue = JOptionPane.showInputDialog(null,"Escolha uma das opções abaixo:", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,
            escolhas, escolhas [0]);
            if(selectedValue != "Desligar Programa"){
                switch((String)selectedValue){
                    case "Adicionar Livro":
                        adicionarLivro();
                        break;
                    case "Pesquisar Livro":
                        pesquisarLivro();
                        break;
                    case "Remover Livro":
                        removerLivro();
                        break;
                }
            }
        }while(selectedValue != "Desligar Programa");
    }

    public static void adicionarLivro(){
        String titulo = JOptionPane.showInputDialog(null,"Digite o titulo do livro:");
        String autor = JOptionPane.showInputDialog(null,"Digite o nome do autor:");
        double preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço do livro:\n     (Exemplo: 2.50)"));
        Array.inserir(new Livro(autor,titulo,preco));
    }

    public static void pesquisarLivro(){
        String titulo = JOptionPane.showInputDialog(null,"Pesquise o nome do livro:");
        int indice = Array.buscarTitulo(titulo);
        if(indice != -1){
            JOptionPane.showMessageDialog(null, Array.mostrar(indice)); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível achar o livro"); 
        }
    }

    public static void removerLivro(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do livro:"));
        if(Array.remover(id)){
            JOptionPane.showMessageDialog(null,"Livro removido com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Não foi possível achar esse ID");
        }
    }
}
