
package Desarrollo;

public class LanzarExcepcion {
    public static void validarEdad(int edad) throws Exception{
        if (edad < 18) {
            throw new Exception("Edad no válida: Debes ser mayor de edad.");
        } else {
            System.out.println("Edad válida.");
        }
    }
    
    public static void main(String args[]) {
        try {
            validarEdad(21);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
