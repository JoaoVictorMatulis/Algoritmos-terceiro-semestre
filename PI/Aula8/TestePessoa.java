package Aula8;

public class TestePessoa {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Jessica", "752");
        Pessoa p2 = new Pessoa("Jessica", "752");
        System.out.println("P1 hash code: "+p1.hashCode());
        System.out.println("P1 nome hash code: "+p1.getNome().hashCode());
        if (p1 == p2) {
            System.out.println("p1 igual p2 com ==");
        } else {
            System.out.println("p1 != p2 com ==");
        }

        if (p1.equals(p2)){
            System.out.println("p1 igual p2 com equals da classe Object");
            }
            else{
            System.out.println("p1 != p2 com equals da classe Object");
            }
    }
}