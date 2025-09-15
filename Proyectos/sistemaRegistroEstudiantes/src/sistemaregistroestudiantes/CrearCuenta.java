package sistemaregistroestudiantes;
import java.util.*;

public class CrearCuenta {
    private List<Usuario> usuarios = new ArrayList<>();
    int contadorAlumnos = 1;
    int contadorProfes = 1;

    public CrearCuenta() {
        usuarios.add(new Administrador("admin", "Administrador", "admin123")); 
    }

    public void registrarUsuario(Scanner sc) {
        System.out.println("Selecciona tu tipo de usuario");
        System.out.println("1. Alumno");
        System.out.println("2. Profesor");
        System.out.print("Tu opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        switch(opcion) {
            case 1:
                
                System.out.println("Carreras disponibles");
                System.out.println("1. - Ingenieria Civil - ");
                System.out.println("2. - Ingenieria Mecanica - ");
                System.out.println("3. - Ingenieria en computacion - ");
                System.out.println("4. - Ingenieria electrica electronica - ");
                System.out.print("Selecciona tu carrera: ");
                int oa = sc.nextInt();
                sc.nextLine();
                String a= "";
                switch(oa) {
                    case 1:
                        a = "Ingenieria Civil";
                        break;
                    case 2:
                        a = "Ingenieria Mecanica";
                        break;
                    case 3:
                        a = "Ingenieria en computacion";
                        break;
                    case 4:
                        a = "Ingenieria electrica electronica";
                        break;
                    default:
                        System.out.println("Opción no valida");
                        break;
                }
                String carrera = a;
                String idA = "A" + String.format("%03d", contadorAlumnos++);
                String contraA = "alu" + idA;
                usuarios.add(new Alumno(idA, nombre, contraA, carrera));
                System.out.println("Alumno registrado. Usuario: " + idA + " Contrasenia: " + contraA);
                break;
            case 2:
                System.out.println("Seleccione la materia que imparte ");
                System.out.println("1. - Algebra - ");
                System.out.println("2. - Calculo y geometria analitica - ");
                System.out.println("3. - Representaciones graficas - ");
                System.out.println("3. - Estatica - ");
                System.out.println("4. - Programacion basica - ");
                System.out.println("6. - Redacción y exposicion de temas de ingenieria - ");
                System.out.println("7. - Igualdad de genero en ingenieria - ");
                System.out.println("8. - Algebra lineal - ");
                System.out.println("9. - Calculo integral - ");
                System.out.println("10. - geologia - ");
                System.out.println("11. - Geometria basica - ");
                System.out.println("12. - Cultura y comunicacion - ");
                System.out.println("13. - Ecuaciones diferenciales - ");
                System.out.println("14. - Calculo vectorial - ");
                System.out.println("15. - Cinematica y dinamica - ");
                System.out.println("16. - Estructuras isostaticas - ");
                System.out.println("17. - Recursos de la construccion - ");
                System.out.println("18. - Sistemas termodinamicos y electromagnetismo - ");
                System.out.println("19. - Probabilidad - ");
                System.out.println("20. - Analisis numerico - ");
                System.out.println("21. - Sistemas quimicos en ingenieria - ");
                System.out.println("22. - Mecanica de materiales I - ");
                System.out.println("23. - Procedimientos constructivos de elementos de estructuras - ");
                System.out.println("24. - Fundamentos de mecanica del medio continuo - ");
                System.out.println("25. - Quimica - ");
                System.out.println("26. - Fisica experimental - ");
                System.out.println("27. - Introduccion a la ingenieria mecanica - ");
                System.out.println("28. - Fundamentos de programacion - ");
                System.out.println("29. - Dibujo mecanico e industrial - ");
                System.out.println("30. - Manufactura - ");
                System.out.println("31. - Estadistica - ");
                System.out.println("32. - Electricidad y magnetismo - ");
                System.out.println("33. - Materiales I - ");
                System.out.println("34. - Termodinamica - ");
                System.out.println("35. - Mecanica - ");
                System.out.println("36. - Estructura de datos y algoritmos I - ");
                System.out.println("37. - Estructura de datos y algoritmos II - ");
                System.out.println("38. - Programacion orientada a objetos - ");
                System.out.println("39. - Fundamentos de estadistica - ");
                System.out.println("40. - Matematicas avanzadas - ");
                System.out.println("41. - Estructuras discretas - ");
                System.out.println("42. - Modelos de programacion orientada a objetos - ");
                System.out.println("43. - Analisis de sistemas y señales - ");
                System.out.println("44. - Costos y evaluacion de proyectos - ");
                System.out.print("Su materia: ");
                int op = sc.nextInt();
                sc.nextLine();
                String p= "0";
                switch(op) {
                    case 1:
                        p = "mat1";
                        break;
                    case 2:
                        p = "mat2";
                        break;
                    case 3:
                        p = "mat3";
                        break;
                    case 4:
                        p = "mat4";
                        break;
                }
                String materia = p;
                String idP= "P" + String.format("%03d", contadorProfes++);
                String contraP = "prof" + idP;
                usuarios.add(new Profesor(idP, nombre, contraP, materia));
                System.out.println("Profesor registrado. Usuario: " + idP + " Contrasenia: " + contraP);
                break;
            default:
                System.out.println("Opción no valida.");
                break;
        }
    }

    public Usuario iniciarSesion(Scanner sc) {
        System.out.print("Usuario: ");
        String id = sc.nextLine();
        System.out.print("Contrasenia: ");
        String contrasena = sc.nextLine();

        for (Usuario u : usuarios) {
            if (u.getId().equals(id) && u.getContrasena().equals(contrasena)) {
                System.out.println("Bienvenido " + u.getNombre() + " (" + u.hijos() + ")");
                return u;
            }
        }
        System.out.println("Usuario o contraseña incorrectos.");
        return null;
    }
    
    public List<Usuario> getUsuarios() {
        return java.util.Collections.unmodifiableList(usuarios);
    }
    
    public Alumno buscarAlumnoPorId(String id) {
        for (Usuario u : usuarios) {
            if (u instanceof Alumno && u.getId().equals(id)) return (Alumno) u;
        }
        return null;
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Usuario u : usuarios) {
            if (u instanceof Profesor && u.getId().equals(id)) return (Profesor) u;
        }
        return null;
    }
    
}