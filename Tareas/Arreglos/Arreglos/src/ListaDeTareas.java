import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ListaDeTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Mi Lista de Tareas ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Marcar tarea como completada (eliminar)");
            System.out.println("4. Ordenar tareas alfabéticamente");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            if (!scanner.hasNextInt()) { // Manejo simple de entradas no numéricas
                System.out.println("Por favor ingresa un número del 1 al 5.");
                scanner.nextLine();
                continue;
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea

            if (opcion == 1) {
                System.out.print("Escribe la nueva tarea: ");
                String nuevaTarea = scanner.nextLine();
                tareas.add(nuevaTarea);
                System.out.println("¡Tarea añadida!");
            } else if (opcion == 2) {
                System.out.println("\n--- Tareas Pendientes (" + tareas.size() + ") ---");
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas por ahora.");
                } else {
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                }
            } else if (opcion == 3) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas para eliminar.");
                    continue;
                }
                System.out.print("¿Qué número de tarea quieres eliminar? ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Debes escribir un número válido.");
                    scanner.nextLine();
                    continue;
                }
                int indiceParaEliminar = scanner.nextInt() - 1;
                scanner.nextLine(); // limpiar salto
                if (indiceParaEliminar >= 0 && indiceParaEliminar < tareas.size()) {
                    tareas.remove(indiceParaEliminar);
                    System.out.println("¡Tarea completada!");
                } else {
                    System.out.println("Número de tarea no válido.");
                }
            } else if (opcion == 4) {
                Collections.sort(tareas);
                System.out.println("¡Tareas ordenadas!");
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Elige del 1 al 5.");
            }
        }
        System.out.println("¡Hasta la próxima!");
        scanner.close();
    }
}