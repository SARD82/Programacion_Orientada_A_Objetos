
package Desarrollo;

public class Main {

    public static void main(String args[]) {
        Rectangulo rectangulo = new Rectangulo(7.5, 5);
        Circulo circulo = new Circulo(6);
        
        System.out.println("Perimetro circulo: " + circulo.getPerimetro());
        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("Perimetro rectangulo: " + rectangulo.getPerimetro());
        System.out.println("Area rectangulo: " + rectangulo.getArea());
    }
}