// Durán Rendón Santiago

package gestionCalificaciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaCalificaciones {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        double[] calificaciones = new double[10];
        int contador = 0;
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE CALIFICACIONES ---");
            System.out.println("1. Agregar calificación");
            System.out.println("2. Calcular promedio");
            System.out.println("3. Listar calificaciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        try {
                            if (contador < calificaciones.length) {
                                System.out.print("Ingrese la calificación: ");
                                double calificacion = sc.nextDouble();

                                if (calificacion < 0 || calificacion > 10) {
                                    throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
                                }

                                calificaciones[contador] = calificacion;
                                contador++;
                                System.out.println("Calificación registrada correctamente.");

                            } else {
                                throw new ArrayIndexOutOfBoundsException("No se pueden agregar más calificaciones (límite alcanzado).");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error: Debe ingresar un número válido.");
                            sc.nextLine(); 
                        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            if (contador == 0) {
                                throw new ArithmeticException("No hay calificaciones registradas para calcular el promedio.");
                            }

                            double suma = 0;
                            int i = 0;
                            while (i < contador) {
                                suma += calificaciones[i];
                                i++;
                            }
                            double promedio = suma / contador;
                            System.out.printf("El promedio de las calificaciones es: %.2f\n", promedio);

                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        if (contador > 0) {
                            System.out.println("\n--- LISTA DE CALIFICACIONES ---");
                            for (int i = 0; i < contador; i++) {
                                System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
                            }
                        } else {
                            System.out.println("No hay calificaciones registradas para mostrar.");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero para la opción del menú.");
                sc.nextLine();
            }

        } while (opcion != 4);

        sc.close();
    }
}