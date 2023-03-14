package ListaEncadeada.lista;

public class Lista {
    
    private Elemento inicio, atual, aux;
    
    public boolean verificar(){
        return inicio == null;
    }

    public void inserir(Object objeto){
        if(verificar()){
            inicio = new Elemento(null, objeto);
            aux=inicio;
        }
        else{
            atual = new Elemento(null, objeto);
            aux.setProx(atual);
            aux=atual;
        }
    }

    public void mostrar(){
        Elemento e = inicio;
        while(e!=null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }
}