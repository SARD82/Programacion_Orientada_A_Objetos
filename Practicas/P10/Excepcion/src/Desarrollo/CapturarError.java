
package Desarrollo;

public class CapturarError {

    public static void main(String args[]) {
        try {
            // Simula un error de memoria
            int[] numeros = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e){
            System.out.println("Error grave del sistema: " + e);
        } finally {
            System.out.println("Liberando recursos...");
        }
    }
}
