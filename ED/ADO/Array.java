/*
 *  Autores:
 *      Nome:João Victor Matulis
 *          Id:1142445416
 *      Nome: Bernardo Galvão de Souza
 *          Id: 1142473154
 */
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

    /**
     * Imprimi as informações do livro, conforme o indice informado:
     * @param indice int
     * @return String
     */
    public static String mostrar(int indice) {
        return lista[indice].toString();
    }

    /**
     * Aumenta o tamanho do array
     * @return Livro[]
     */
    private static Livro[] alocarNovoArray() {
        Livro[] novo = new Livro[lista.length + 4];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    /**
     * Busca o livro a partir da busca binaria
     * @param titulo String
     * @return int
     */
    public static int buscarTitulo(String titulo) {
        insertionSort(lista);
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (titulo.equals(lista[meio].getTitulo())) {
                return meio;
            } else if (titulo.compareTo(lista[meio].getTitulo()) > 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    /**
     * Remove um livro do array a partir do seu id
     * @param id int
     * @return boolean
     */
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

    /**
     * Busca o id no array de forma linear
     * @param id int
     * @return int
     */
    public static int buscarId(int id) {
        for (int i = 0; i < indice; i++) {
            if (id == lista[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Organiza o array de forma alfabetica
     * @param lista Livro[]
     */
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
