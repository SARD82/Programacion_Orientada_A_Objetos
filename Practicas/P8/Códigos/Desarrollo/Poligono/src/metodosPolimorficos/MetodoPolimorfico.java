
package metodosPolimorficos;
import poligonoPruebaFigura.Poligono;
import poligonoPruebaFigura.Triangulo;
import poligonoPruebaFigura.Cuadrilatero;

public class MetodoPolimorfico {
    public static void main(String args[]) {
        Poligono poligono = new Poligono();
        getPoligono(poligono);
        poligono = new Triangulo();
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
    }
    
    public static void getPoligono(Poligono p) {
        if (p instanceof Triangulo) {
            System.out.println("El objeto es un triángulo.");
        } else {
            if (p instanceof Cuadrilatero) {
                System.out.println("El objeto es un Cuadrilátero.");
            } else {
                System.out.println("El objeto es un polígono.");
            }
        }
    }
}
