
package Desarrollo;

import java.util.Scanner;

public class MultiplesExcepciones {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese un número entero: ");
            int num = Integer.parseInt(sc.nextLine());
            int[] arreglo = {1, 2, 3};
            System.out.println("Elemento: " + arreglo[num]); //puede causar ArrayIndexOutOfBoundsException
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera del rango del arreglo.");
        } finally {
            System.out.println("Fin del programa");
            sc.close();
        }
    }
}
