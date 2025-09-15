package sistemaregistroestudiantes;

import java.util.List;
import java.util.Scanner;

public class SistemaRegistroEstudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CrearCuenta sistema = new CrearCuenta();
        Usuario usuarioActivo = null;

        while (true) {
            if (usuarioActivo == null) {
                System.out.println("\n=== Sistema de Registro de Estudiantes ===");
                System.out.println("1. Crear cuenta");
                System.out.println("2. Iniciar sesión");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
                int op = leerEntero(sc);

                if (op == 1) {
                    sistema.registrarUsuario(sc);
                } else if (op == 2) {
                    usuarioActivo = sistema.iniciarSesion(sc);
                } else if (op == 3) {
                    System.out.println("¡Hasta luego!");
                    break;
                } else {
                    System.out.println("Opción inválida.");
                }
            } else {
                usuarioActivo.mostrarMenu();
                System.out.print("Elige una opción: ");
                int op = leerEntero(sc);

                if (usuarioActivo instanceof Alumno) {
                    Alumno a = (Alumno) usuarioActivo;
                    switch (op) {
                        case 1:
                            a.verPlanEstudios();
                            break;
                        case 2:
                            a.mostrarHistorialAcademico();
                            break;
                        case 3:
                            usuarioActivo = null;
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }

                } else if (usuarioActivo instanceof Profesor) {
                    Profesor p = (Profesor) usuarioActivo;
                    switch (op) {
                        case 1: {
                            System.out.print("ID del alumno (ej. A001): ");
                            String idAlumno = sc.nextLine().trim();
                            Alumno alum = sistema.buscarAlumnoPorId(idAlumno);
                            if (alum == null) {
                                System.out.println("Alumno no encontrado.");
                                break;
                            }

                            //Materias del plan
                            List<Materia> plan = alum.getCarreraPlan().getPlan();
                            if (plan == null || plan.isEmpty()) {
                                System.out.println("El alumno no tiene plan de estudios cargado.");
                                break;
                            }
                            System.out.println("\nMaterias del plan:");
                            for (int i = 0; i < plan.size(); i++) {
                                Materia m = plan.get(i);
                                System.out.printf("%d) [%s] %s (Sem %d, %d cr)%n",
                                        i + 1, m.getId(), m.getNombre(), m.getSemestre(), m.getCreditos());
                            }
                            System.out.print("Elige materia (número): ");
                            int idx = leerEntero(sc) - 1;
                            if (idx < 0 || idx >= plan.size()) {
                                System.out.println("Índice inválido.");
                                break;
                            }
                            Materia materia = plan.get(idx);

                            //Periodo
                            System.out.print("Año del periodo (ej. 2025): ");
                            int anio = leerEntero(sc);
                            System.out.print("Semestre (1 o 2): ");
                            int sem = leerEntero(sc);
                            Periodo periodo = new Periodo(anio, sem);

                            //Calificación
                            System.out.print("Calificación (0 a 10): ");
                            double valor = leerDouble(sc);

                            try {
                                p.asignarCalificacion(alum, materia, periodo, valor);
                                System.out.println("Calificación registrada/actualizada.");
                            } catch (IllegalArgumentException ex) {
                                System.out.println("Error: " + ex.getMessage());
                            }
                            break;
                        }
                        case 2:
                            usuarioActivo = null;
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }

                } else if (usuarioActivo instanceof Administrador) {
                    switch (op) {
                        case 1: {
                            for (Usuario u : sistema.getUsuarios()) {
                                System.out.printf("%s - %s (%s)%n", u.getId(), u.getNombre(), u.hijos());
                            }
                            break;
                        }
                        case 2:
                            usuarioActivo = null;
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                } else {
                    System.out.println("Tipo de usuario no soportado.");
                    usuarioActivo = null;
                }
            }
        }

        sc.close();
    }

    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Ingresa un número válido: ");
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    private static double leerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Ingresa un número válido: ");
        }
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
    }
}
