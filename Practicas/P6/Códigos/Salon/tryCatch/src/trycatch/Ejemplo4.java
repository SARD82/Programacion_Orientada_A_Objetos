
package trycatch;

public class Ejemplo4 {

    public static void main(String args[]) {
        try {
            int numero = Integer.parseInt("abc"); // no es un número válido
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir a número");
        }
    }
}
