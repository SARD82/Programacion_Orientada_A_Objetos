
package Resultados;


public class Main {

    public static void main(String args[]) {
        Libro libro1 = new Libro();
        libro1.titulo = "Harry Potter";
        libro1.autor = "J.K Rowlin";
        
        Revista revista1 = new Revista();
        revista1.titulo = "National Geographic";
        revista1.autor = "Varios";
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        
        biblioteca.mostrarMateriales();
    }
}