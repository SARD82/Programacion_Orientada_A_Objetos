
package Desarrollo;


public class Rectangulo extends Forma {
    private double base;
    private double altura;
    
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getPerimetro(){
        return base * 2 + altura * 2;
    }
    
    public double getArea(){
        return base * altura;
    }
}