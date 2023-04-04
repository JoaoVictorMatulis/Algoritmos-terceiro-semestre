package ListaEncadeadaDupla.lista;

import java.text.DecimalFormat;

public class Produto {
    private String nome, categoria;
    private double preco;
    private int id;
    private static int valor = 1;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Produto() {
    }

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.id = valor++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void desconto(double desconto) {
        preco = preco * desconto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + df.format(preco)
                + "]";
    }

}
