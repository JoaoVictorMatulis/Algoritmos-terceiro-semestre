package Aula7.FiguraGeometrica;

import javax.swing.JOptionPane;

public class Triangulo extends FiguraGeometrica{
    private double base,altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        while(base <= 0){
            base = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um número positivo"));
        }
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        while(altura <= 0){
            altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um número positivo"));
        }
        this.altura = altura;
    }

    public void calcularArea(){
        super.area = (base * altura)/2;
    }
}
