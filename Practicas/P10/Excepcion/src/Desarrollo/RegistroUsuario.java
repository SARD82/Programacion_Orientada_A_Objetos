
package Desarrollo;

import java.util.Scanner;

public class RegistroUsuario {
    
    public static void validarNombre(String nombre) throws Exception {
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacio.");
        }
    }
    
    public static void validarEdad(String edadTexto) throws Exception {
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad <= 0) {
                throw new Exception("La edad debe ser mayor a 0.");
            }
        } catch (NumberFormatException e) {
            throw new Exception("La edad debe de ser un número entero.");
        }
    }
    
    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Correo electrónico no válido: falta '@'.");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            validarNombre(nombre);
            
            System.out.println("Edad: ");
            String edad = sc.nextLine();
            validarEdad(edad);
            
            System.out.println("Correo electrónico: ");
            String email = sc.nextLine();
            validarEmail(email);
            
            System.out.println("\n Registro exitoso!");
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Email: " + email);
        } catch (Exception e){
            System.out.println("Error en el registro: " + e.getMessage());
        } finally {
            System.out.println("Proceso finalizado.");
            sc.close();
        }
    }
}
