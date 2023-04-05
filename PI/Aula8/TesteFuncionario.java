package Aula8;
public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("João","1283");
        Funcionario f2 = new Funcionario("Joãa","1233");
        if(f1.equals(f2)){
            System.out.println("Funcionario 1 é igual ao 2\n");
        }else{
            System.out.println("Os funcionarios são diferentes\n");
        }
        System.out.println("f1 hash code: "+f1.hashCode());
        System.out.println("f2 hash code: "+f2.hashCode());
    }
}
