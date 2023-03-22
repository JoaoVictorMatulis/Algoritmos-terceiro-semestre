package Aula7.FiguraGeometrica;

import javax.swing.JOptionPane;

public class Trapezio extends FiguraGeometrica{
    private double baseMaior;
    private double baseMenor;
    private double altura;


    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    

    public double getBaseMaior() {
        return this.baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        while(baseMaior <= 0){
            baseMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um número positivo"));
        }
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return this.baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        while(baseMenor <= 0){
            baseMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe um número positivo"));
        }
        this.baseMenor = baseMenor;
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
        super.area = ((baseMaior - baseMenor) * altura)/2;
    }
}
