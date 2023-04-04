package ListaEncadeadaDupla.lista;

import javax.swing.JOptionPane;

public class Lista2 {
    private Elemento inicio, atual, aux;

    /**
     * Inseri um produto para a lista
     * 
     * @param objeto Object
     */
    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(null, null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, aux, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void mostrarTodosProx() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public void mostrarTodosAnts() {
        Elemento e = atual;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getAnt();
        }
    }

    public void mostrar(Modo modo) {
        Elemento e;
        Object[] a = new Object[3];
        int indice = 0;
        if (modo.equals(Modo.DIREITA)) {
            e = inicio;
            while (e != null) {
                if(indice < a.length){
                    a[indice++] = e.getObjeto();
                    e = e.getProx();
                }else{
                    Object[] novo = new Object[a.length+4];
                    System.arraycopy(a, 0, novo, 0, a.length);
                    a = novo;
                }
            }
        }else{
            e = atual;
            while (e != null) {
                if(indice < a.length){
                    a[indice++] = e.getObjeto();
                    e = e.getProx();
                }else{
                    Object[] novo = new Object[a.length+4];
                    System.arraycopy(a, 0, novo, 0, a.length);
                    a = novo;
                }
            }
        }
        JOptionPane.showMessageDialog(null, a);
    }

    public Elemento pesquisar(int id){
        Elemento e = inicio;
        Produto c;
        while(e!= null){
            c = (Produto)e.getObjeto();
            if(id==c.getId()){
                return e;
            }
            e=e.getProx();
        }
        return null;
    }

    public boolean remover(int id){
        Elemento e = pesquisar(id);
        if(e!=null){
            if(e == inicio){
                inicio = e.getProx();
                e.setProx(null);
                inicio.setAnt(null);
                e=inicio;
            }else if(e == atual){
                atual = e.getAnt();
                aux = atual;
                atual.setProx(null);
                e.setAnt(null);
                e=atual;
            }else{
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setProx(null);
                e.setAnt(null);
                e=null;
            }
            return true;
        }
        return false;
    }

    public boolean atulizar(int id){
        Elemento e = pesquisar(id);
        if(e!=null){
            Produto p = (Produto)e.getObjeto();
            p.setNome(JOptionPane.showInputDialog(null, "Digite o nome do produto"));
            p.setCategoria(JOptionPane.showInputDialog(null, "Digite a categoria do produto"));
            p.setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto")));
            return true;
        }
        return false;
    }
}
