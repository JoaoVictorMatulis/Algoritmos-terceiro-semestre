import javax.swing.JOptionPane;

public class TesteData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia")));
        data.ajustarMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mês")));
        data.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano")));

        System.out.print(data.toString());

        System.out.println("\nAnos Bissextos:");
        for (int i = 0; i <= 2024; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
