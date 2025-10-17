
package trycatch;

public class Ejemplo3 {
    public static void main(String args[]) {
        String nombre = null;
        try {
            System.out.println(nombre.length()); //nombre es null
        } catch (NullPointerException e) {
            System.out.println("Error: La variable apunta a null");
        }
    }
}
