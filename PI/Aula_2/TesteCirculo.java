import javax.swing.JOptionPane;

public class TesteCirculo {
    public static void main(String[] args) {
        // Crie um objeto da classe Circulo
        Circulo circulo = new Circulo();

        // Coloque aqui o codigo para alterar o raio para 10
        circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio desse circulo:")));

        // Coloque aqui o codigo para obter o valor do raio e do perímetro do circulo
        System.out.printf("Raio do circulo: %.2f\nPerímetro do circulo: %.2f", circulo.getRaio(),
                ((2 * 3.14f) * circulo.getRaio()));
    }
}
