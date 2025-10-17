
package abstractas;

public class PruebaFigurasGeometricas {

    public static void main(String args[]) {
        // No se pueden crear objetos de clases abstractas
        // Poligono poligono = new Poligono();
        Poligono poligono;
        
        // Una referencia de una clase abstracta sí
        // puede almacenar un objeto de una clase concreta
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
}
