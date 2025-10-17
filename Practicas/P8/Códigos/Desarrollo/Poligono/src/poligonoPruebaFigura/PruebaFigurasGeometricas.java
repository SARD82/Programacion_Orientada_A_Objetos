
package poligonoPruebaFigura;

public class PruebaFigurasGeometricas {

    public static void main(String args[]) {
        Poligono poligono = new Poligono();
        // Polígono puede comportarse como Objeto
        Object objeto = poligono;
        System.out.println(objeto);
        
        // Una referencia puede ser reasignada a otros objetos
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        // Solo se pueden ejecutar los métodos que están definidos
        // en la referencia, sin embargo, se ejecutarán como están
        // implementados en la instancia.
        // El método toString se puede ejecutar por que está definido
        // en polígono, sin embargo, se va a ejecutar como está
        // implementado en la instancia (Cuadrilátero en este caso).
        System.out.println(poligono);
        // El método setBase no está definido en Polígono, por lo tanto
        // la siguiente instrucción marcaría un error:
        // poligono.setBase(5.5);
    }
}
