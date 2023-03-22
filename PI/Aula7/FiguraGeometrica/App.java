package Aula7.FiguraGeometrica;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		FiguraGeometrica fg[] = new FiguraGeometrica[qtd];
		
		for (int i = 0; i < fg.length; i++) {
			FiguraGeometrica t=null;
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite:\n1-Trapézio \n2-Triângulo \n3-Triângulo Retângulo \n4-Triângulo Equilátero "));
			if(escolha == 1){
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Trapézio:"));
				int baseMaior = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base Maior:"));
				int baseMenor = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base Menor:"));
				t = new Trapezio(baseMaior, baseMenor, altura);		
				t.calcularArea();				
				fg[i] = t;				
			}
			else if(escolha == 2){
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Triângulo:"));
				int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base:"));
				t = new Triangulo(base, altura);
				t.calcularArea();
				fg[i] = t;
			}
			else if(escolha == 3){
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Triângulo:"));
				int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base:"));
				t = new TrianguloRetangulo(base, altura);
				t.calcularArea();
				fg[i] = t;
			}
			else if(escolha == 4){
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Triângulo:"));
				int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base:"));
				t = new TrianguloEquilatero(base, altura);
				t.calcularArea();
				fg[i] = t;
			}
		}		
	}
}
