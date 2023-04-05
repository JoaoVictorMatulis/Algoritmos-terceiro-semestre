package Aula9.Pessoa;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class TestePessoa {
    public static void main(String[]args){
        String cpf1 = "251"; Pessoa p1 = new Pessoa("Carlos", cpf1);
        String cpf2 = "573"; Pessoa p2 = new Pessoa("Roberto", cpf2);
        String cpf3 = "952"; Pessoa p3 = new Pessoa("Matheus", cpf3);
        HashMap<String,Pessoa> pessoas = new HashMap<String,Pessoa>();
        pessoas.put(cpf1, p1);  
        pessoas.put(cpf2, p2);  
        pessoas.put(cpf3, p3);
        String chave = "952";
        imprimirMapPessoas(pessoas);
        removerElemento(pessoas,chave);
        imprimirMapPessoas(pessoas);
    }

    public static void imprimirMapPessoas(HashMap<String,Pessoa> pessoas){
        String chave;
        Pessoa p;
        Set<String> chaves = pessoas.keySet();
        Iterator<String> iTer = chaves.iterator();
        while(iTer.hasNext()){
            chave = (String)iTer.next();
            p = (Pessoa)pessoas.get(chave);
            System.out.println("Chave: "+chave);
            System.out.println(p+"");
        }
    }


    public static void removerElemento(HashMap<String,Pessoa> map, String chave){
        Pessoa pessoaRemovida = null;
        if(map.containsKey(chave)){
            System.out.print("\nPessoa removida do hashMap\n");
            pessoaRemovida = (Pessoa)map.remove(chave);
            System.out.println(pessoaRemovida+"\n");
        }else{
            System.out.println("CPF (chave) não encontrado no hashmap\n");
        }
    }
}
