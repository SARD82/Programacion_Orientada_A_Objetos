
package Desarrollo;

public class DivisionEjemplo {
    public static void main(String args[]) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b; //genera ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            System.out.println("Detalle: " + e.getMessage());
        } finally {
            System.out.println("Ejecución del bloque finally completada.");
        }
    }
}
