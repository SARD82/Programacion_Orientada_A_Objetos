// Importar fuera de las clases
import java.util.Scanner; //Entrada y salida de datos

public class bibliotecaScanner {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menú de opciones:");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar la fecha");
        System.out.println("3. Calcular el doble de un número");
        System.out.println("4. Salir");
        System.out.println("Elige una opcion:");
        
        int option = sc.nextInt(); //  Input gonna be interger
        
        switch(option) {
            case 1:
                System.out.println("¿Cómo te llamas?");
                sc.nextLine(); // clean buffer ??
                String nombre = sc.nextLine();
                System.out.println("Hola, " + nombre + ":");
                break;
            case 2:
                java.util.Date fecha = new java.util.Date(); // call date
                System.out.println("La fecha actual es: " + fecha);
                break;
            case 3:
                System.out.println("Inserte un número: ");
                int num = sc.nextInt();
                System.out.println("El doble de " + num + " es " + (num * 2));
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
        }
    sc.close();
    }
}