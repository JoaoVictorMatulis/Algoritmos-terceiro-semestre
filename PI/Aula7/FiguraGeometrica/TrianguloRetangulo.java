package Aula7.FiguraGeometrica;

import javax.swing.JOptionPane;

public class TrianguloRetangulo extends Triangulo{
    
    public TrianguloRetangulo(double base, double altura){
        super(base, altura);
    }

    public void calcularArea(){
        JOptionPane.showMessageDialog(null,"Calculando a área de um triângulo retângulo");
        super.calcularArea();
        JOptionPane.showMessageDialog(null,"A área do triângulo retângulo é: "+super.area);
    }
}
