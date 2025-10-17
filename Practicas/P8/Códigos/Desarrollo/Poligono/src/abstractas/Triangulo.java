
package abstractas;

public class Triangulo extends Poligono {
    private int alfa, beta, gama;
    private float a, b,c;
    private float base, altura;
    
    // La clase Triángulo está obligada a sobrescribir los métodos
    // abstractos que definió la clase abstracta de la que hereda
    
    public double area() {
        return (base*altura)/2;
    }
    
    public double perimetro() {
        return a*b*c;
    }
    
    public String toString() {
        return "Triángulo";
    }
}