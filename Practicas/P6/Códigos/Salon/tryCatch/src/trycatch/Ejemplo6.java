
package trycatch;
import java.io.*;

public class Ejemplo6 {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } finally {
            System.out.println("Bloque finally siempre se ejecuta");
        }
    }
}
