
package trycatch;

public class Ejemplo7 {
    public static void verificarEdad(int edad){
        if (edad < 18){
            throw new IllegalArgumentException("Edad no válida, debe ser mayor de 18");
        }
        System.out.println("Acceso permitido");
    }
    
    public static void main(String args[]) {
        try {
            verificarEdad(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
