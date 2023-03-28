package ListaEncadeada.lista;

public class Lista {

    private Elemento inicio, atual, aux;
    private int valor = 1;

    public boolean verificar() {
        return inicio == null;
    }

    /**
     * Inseri um contato para a lista
     * 
     * @param objeto Object
     */
    public void inserir(Object objeto) {
        Contato contato = (Contato) objeto;
        contato.setId(valor++);
        if (verificar()) {
            inicio = new Elemento(null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void mostrar() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente
     * encadeada e retorna um array com três informações,
     * indice 0 - Tipo abstrato de dados,
     * indice 1 - Endereço do elemento,
     * indice 2 - Endereço de elemento anterior do indice 1.
     * 
     * @param id int
     * @return Object[]
     */
    public Object[] pesquisar(int id) {
        if (!verificar()) {
            Object[] v = new Object[3];
            Elemento e = inicio;
            Elemento auxRem = null;
            Contato c;
            while (e != null) {
                c = (Contato) e.getObjeto();
                if (id == c.getId()) {
                    v[0] = c;
                    v[1] = e;
                    v[2] = auxRem;
                    return v;
                }
                auxRem = e;
                e = e.getProx();
            }
        }
        return null;
    }

    public boolean remover(int id) {
        Object[] v = pesquisar(id);
        if (v != null) {
            Elemento e = (Elemento) v[1];
            Elemento auxRem = (Elemento) v[2];
            // 1-remoção do primeiro elemento
            if (e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                e = null;
            }
            // 2- remoção do ultimo elemento
            else if (e == atual) {
                aux = auxRem;
                atual = auxRem;
                auxRem.setProx(null);
            }
            // 3- remoção de um elemento qualquer
            else {
                auxRem.setProx(e.getProx());
                e.setProx(null);
                e = auxRem;
            }
            return true;
        }
        return false;
    }
}