package Aula7.Castup;

public class Teste {
    public static void main(String args[]) {
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        Teste t = new Teste();
        t.converter(c);
        t.converter(f);
    }

    public void converter(Pessoa p) {
        // verifica se o objeto p eh uma instancia da classe Cliente
        if (p instanceof Cliente) {
            Cliente cli = (Cliente) p;
            cli.imprimir();
        } else {
            Funcionario fun = (Funcionario) p;
            fun.imprimir();
        }
    }
}
