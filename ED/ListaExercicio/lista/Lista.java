package ListaExercicio.lista;

public class Lista {
    private Elemento inicio,atual,aux;
    private int valorId = 1;

    /**
     * Inseri um produto para a lista
     * 
     * @param objeto Object
     */
    public void inserir(Object objeto){
        Produto produto = (Produto) objeto;
        produto.setId(valorId++);
        if(inicio == null){
            inicio = new Elemento(null,null,objeto);
            aux = inicio;
        }else{
            atual = new Elemento(null,aux,objeto);
            aux.setProx(atual);
            aux = atual;    
        }
    }

    public void mostrar(){
        Elemento e = inicio;
        while(e != null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public Object[] mostrarJOptionPane(){
        Elemento e = inicio;
        Object[] a = new Object[3];
        int indice = 0;
        while(e != null){
            if(indice < a.length){
                a[indice++] = e.getObjeto();
                e = e.getProx();
            }else{
                Object[] novo = new Object[a.length+4];
                System.arraycopy(a, 0, novo, 0, a.length);
                a = novo;
            }
        }
        return a;
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente
     * encadeada e retorna um array com duas informações,
     * indice 0 - Tipo abstrato de dados,
     * indice 1 - Endereço do elemento,
     * 
     * @param id int
     * @return Object[]
     */
    public Object[] pesquisar(int id) {
        if (inicio!= null) {
            Object[] v = new Object[2];
            Elemento e = inicio;
            Produto c;
            while (e != null) {
                c = (Produto) e.getObjeto();
                if (id == c.getId()) {
                    v[0] = c;
                    v[1] = e;
                    return v;
                }
                e = e.getProx();
            }
        }
        return null;
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente
     * encadeada e retorna um array com duas informações,
     * indice 0 - Tipo abstrato de dados,
     * indice 1 - Endereço do elemento,
     * 
     * @param id int
     * @return Object[]
     */
    public Object[] pesquisar(String nome) {
        if (inicio!= null) {
            Object[] v = new Object[2];
            Elemento e = inicio;
            Produto c;
            while (e != null) {
                c = (Produto) e.getObjeto();
                if (nome.equals(c.getNome())) {
                    v[0] = c;
                    v[1] = e;
                    return v;
                }
                e = e.getProx();
            }
        }
        return null;
    }

    public boolean remover(int id) {
        Object[] v = pesquisar(id);
        if (v != null) {
            Elemento e = (Elemento) v[1];
            Elemento ant = e.getAnt();
            // 1-remoção do primeiro elemento
            if (e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                e = null;
            }
            // 2- remoção do ultimo elemento
            else if (e == atual) {
                aux = e.getAnt();
                atual = e.getAnt();
                e.setAnt(null);
                atual.setProx(null);
                e = atual;
            }
            // 3- remoção de um elemento qualquer
            else {
                ant.setProx(e.getProx());
                ant = e.getProx();
                e.setProx(null);
                ant.setAnt(e.getAnt());
                e.setAnt(null);
                e = null;
            }
            return true;
        }
        return false;
    }

    public boolean remover(String nome) {
        Object[] v = pesquisar(nome);
        if (v != null) {
            Elemento e = (Elemento) v[1];
            Elemento ant = e.getAnt();
            // 1-remoção do primeiro elemento
            if (e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                e = null;
            }
            // 2- remoção do ultimo elemento
            else if (e == atual) {
                aux = e.getAnt();
                atual = e.getAnt();
                e.setAnt(null);
                atual.setProx(null);
                e = atual;
            }
            // 3- remoção de um elemento qualquer
            else {
                ant.setProx(e.getProx());
                ant = e.getProx();
                e.setProx(null);
                ant.setAnt(e.getAnt());
                e.setAnt(null);
                e = null;
            }
            return true;
        }
        return false;
    }

    public void desconto(String categoria, double desconto){
        Elemento e = inicio;
        desconto = (100 - desconto)/100;
        while(e != null){
            Produto produto = (Produto)e.getObjeto();
            if(categoria.equals(produto.getCategoria())){
                produto.desconto(desconto);
            }
            e = e.getProx();
        }
    }
}
