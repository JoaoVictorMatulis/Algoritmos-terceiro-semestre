package ADO;

import java.util.Random;

public class Array {
    private static Livro[] lista = new Livro[3];
    private static int indice = 0;
    private static Random random = new Random();

    /**
     * Inserir um novo livro para o array
     * 
     * @param livro Livro
     */

    public static void inserir(Livro livro) {
        if (indice < lista.length) {
            int id = random.nextInt(10);
            boolean cont = true;
            int num = 1;
            if (indice > 0) {
                do{ num = 1;
                    for(int i = 0; i < indice; i++){
                    if (id == lista[i].getId()){
                    id = random.nextInt(10);
                      num = 0;
                    }
                    if (num == 0)
                    cont = true;
                    else if (num ==1)
                    cont = false;           
                    }
                } while(cont == true);
            }
            livro.setId(id);
            lista[indice++] = livro;
        } else {
            lista = alocarNovoArray();
            inserir(livro);
        }
    }

    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
        }
    }

    private static Livro[] alocarNovoArray() {
        Livro[] novo = new Livro[lista.length + 4];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    public static String buscarTitulo(String titulo) {
        insertionSort(lista);
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (titulo.equals(lista[meio].getTitulo())) {
                return lista[meio].toString();
            } else if (titulo.compareTo(lista[meio].getTitulo()) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }

    public static boolean remover(int id) {
        int rem = buscarId(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    public static int buscarId(int id) {
        for (int i = 0; i < indice; i++) {
            if (id == lista[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public static void insertionSort(Livro[] lista) {
        for (int i = 0; i < indice; i++) {
            Livro temp = lista[i];
            int j = i;
            while (j > 0 && lista[j - 1].getTitulo().compareTo(temp.getTitulo()) > 0) {
                lista[j] = lista[j - 1];
                j--; // j=j-1;
            }
            lista[j] = temp;
        }
    }

}