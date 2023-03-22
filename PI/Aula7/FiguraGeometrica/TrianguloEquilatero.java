package Aula7.FiguraGeometrica;

import javax.swing.JOptionPane;

public class TrianguloEquilatero extends Triangulo{
    
    public TrianguloEquilatero(double base, double altura){
        super(base, altura);
    }

    public void calcularArea(){
        JOptionPane.showMessageDialog(null,"Calculando a área de um triângulo equilátero");
        super.calcularArea();
        JOptionPane.showMessageDialog(null,"A área do triângulo equilátero é: "+super.area);
    }
}
