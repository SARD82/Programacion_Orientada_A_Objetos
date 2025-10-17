
package trycatch;

public class Ejemplo1 {
    public static void main(String[] args) {
        try {
            int resultado = 10/0;
            System.out.println("Resultado: " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida");
        }
    }
    
}
