
package trycatch;

public class Ejemplo2 {
    public static void main(String args[]) {
        int[] numeros = {1, 2, 3};
        try {
            System.out.println(numeros[5]); // Indice fuera de rango
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Indice fuera de los límites del arreglo");
        }
    }
}
