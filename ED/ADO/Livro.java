/*
 *  Autores:
 *      Nome:João Victor Matulis
 *          Id:1142445416
 *      Nome: Bernardo Galvão de Souza
 *          Id: 1142473154
 */
public class Livro {
    private int id;
    private String autor;
    private String titulo;
    private double preco;

    public Livro(){
      
    }
  
    public Livro(String autor, String titulo, double preco){
      this.autor = autor;
      this.titulo = titulo;
      this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nId:" + id + "\nAutor: " + autor + "\nTitulo: " + titulo + "\nPreço: R$%.2f"+preco;
    }

}
