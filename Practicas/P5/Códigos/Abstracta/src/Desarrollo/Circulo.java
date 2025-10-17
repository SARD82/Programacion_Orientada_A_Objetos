
package Desarrollo;

public class Circulo extends Forma{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getPerimetro(){
        return 2 * Math.PI * radio;
    }
    
    public double getArea(){
        return Math.PI * radio;
    }
}