
package trycatch;

public class Ejemplo5 {
    public static void main(String args[]) {
        try {
            String texto = null;
            System.out.println(texto.length()); // puede lanzar NullPointerException
            int x = 5/0; // puede lanzar ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Error: cadena nula");
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero");
        }
    }
}
