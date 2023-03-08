package Pessoa;
public class Acessar{
    public static void main(String[] args){
        Pessoa pa = new Pessoa();
        PessoaFisica p = new PessoaFisica("Joao","12312312","rua","123","123");
        System.out.println(pa.toString());
        System.out.println(p.toString());
    }
}