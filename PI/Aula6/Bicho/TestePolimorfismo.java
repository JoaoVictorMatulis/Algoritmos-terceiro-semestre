package Aula6.Bicho;

public class TestePolimorfismo {
    public static void main(String[] args){
        Bicho b;
        //String animal = "cachorro";
        String animal = "gato";
        if(animal.equals("cachorro")){
            b = new Cachorro();
        }
        else{
            b = new Gato();
        }
        b.fala();
    }
}
