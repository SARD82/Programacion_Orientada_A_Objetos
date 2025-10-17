
package abstractas;

public class Cuadrilatero extends Poligono {
    
    private int alfa, beta;
    
    private float a, b;
    
    private float base, altura;
    
    // La clase Cuadrilátero está obligada a sobrescribir los métodos
    // abstractos que definió la clase abstracta de la que hereda.
    
    public double area() {
        return base*altura;
    }
    
    public double perimetro() {
        return 2*a*b;
    }
    
    public String toString() {
        return "Cuadrilátero";
    }
}
