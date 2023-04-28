public class UsaCliente {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        BancoDados bancoDados = new BancoDados();
        bancoDados.conecta();
        if (bancoDados.estaConecatdo()) {

            bancoDados.inserir("Joaquim Jose");
            bancoDados.listar();
            bancoDados.editar("5", "Fafazinha III");
            bancoDados.excluir("3");

        } else {
            System.out.println("Banco NÃO OK");
        }
    }
}
