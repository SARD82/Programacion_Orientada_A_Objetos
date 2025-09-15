package sistemaregistroestudiantes;

import java.util.*;

public class Carrera {
    private final String nombre;
    private final List<Materia> plan = new ArrayList<>();
    
    public Carrera(String nombre) {
        this.nombre = nombre;
        cargarPlanAutomatico();
    }
    
    public static Carrera desdeOpcion(int opcion) {
        switch(opcion) {
            case 1: return new Carrera("Ingenieria Civil");
            case 2: return new Carrera("Ingenieria Mecanica");
            case 3: return new Carrera("Ingenieria en computacion");
            case 4: return new Carrera("Ingenieria electrica electronica");
            default:
                System.out.println("Opcion invalida: " + opcion);
                return new Carrera("carrera desconocida");
        }
    }
    
    private void cargarPlanAutomatico() {
        switch(nombre.toLowerCase()) {
            case "ingenieria civil":
                plan.add(new Materia("1120", "algebra", 8, 1));
                plan.add(new Materia("1121", "calculo y geometria analitica", 12, 1));
                plan.add(new Materia("1128", "representaciones graficas", 8, 1));
                plan.add(new Materia("1127", "programacion basica", 6, 1));
                plan.add(new Materia("1124", "redacción y exposicion de temas de ingenieria", 6, 1));
                plan.add(new Materia("8000", "igualdad de genero en ingenieria", 0, 1));
                plan.add(new Materia("1220", "algebra lineal", 8, 2));
                plan.add(new Materia("1221", "calculo integral", 8, 2));
                plan.add(new Materia("1223", "estatica", 8, 2));
                plan.add(new Materia("1506", "geologia", 9, 2));
                plan.add(new Materia("1229", "geomatica basica", 9, 2));
                plan.add(new Materia("1222", "cultura y comunicacion", 2, 2));
                plan.add(new Materia("1325", "ecuaciones diferenciales", 8, 3));
                plan.add(new Materia("1321", "calculo vectorial", 8, 3));
                plan.add(new Materia("1322", "cinematica y dinamica", 8, 3));
                plan.add(new Materia("0275", "estructuras isostaticas", 9, 3));
                plan.add(new Materia("1407", "recursos de la construccion", 6, 3));
                plan.add(new Materia("1333", "sistemas termodinamicos y electromagnetismo", 8, 3));
                plan.add(new Materia("1436", "probabilidad", 8, 4));
                plan.add(new Materia("1433", "analisis numerico", 8, 4));
                plan.add(new Materia("1450", "sistemas quimicos en ingenieria", 6, 4));
                plan.add(new Materia("0465", "mecanica de materiales I", 9, 4));
                plan.add(new Materia("1444", "procedimientos constructivos de elementos de estructuras", 6, 4));
                plan.add(new Materia("1555", "fundamentos de mecanica del medio continuo", 6, 4));
            case "ingenieria mecanica":
                plan.add(new Materia("1120", "algebra", 8, 1));
                plan.add(new Materia("1121", "calculo y geometria analitica", 12, 1));
                plan.add(new Materia("1123", "quimica", 10, 1));
                plan.add(new Materia("2211", "fisica experimental", 10, 1));
                plan.add(new Materia("2212", "introduccion a la ingenieria mecanica", 6, 1));
                plan.add(new Materia("8000", "igualdad de genero en ingenieria", 0, 1));
                plan.add(new Materia("1220", "algebra lineal", 8, 2));
                plan.add(new Materia("1221", "calculo integral", 8, 2));
                plan.add(new Materia("1223", "estatica", 8, 2));
                plan.add(new Materia("1222", "fundamentos de programacion", 10, 2));
                plan.add(new Materia("1209", "dibujo mecanico e industrial", 6, 2));
                plan.add(new Materia("1124", "redacción y exposicion de temas de ingenieria", 6, 2));
                plan.add(new Materia("1436", "probabilidad", 8, 3));
                plan.add(new Materia("1321", "calculo vectorial", 8, 3));
                plan.add(new Materia("1325", "ecuaciones diferenciales", 8, 3));
                plan.add(new Materia("1322", "cinematica y dinamica", 8, 3));
                plan.add(new Materia("1225", "manufactura", 8, 3));
                plan.add(new Materia("1222", "cultura y comunicacion", 2, 3));
                plan.add(new Materia("1569", "estadistica", 8, 4));
                plan.add(new Materia("1414", "elictricidad y magnetismo", 10, 4));
                plan.add(new Materia("2400", "materiales I", 10, 4));
                plan.add(new Materia("1437", "termodinamica", 10, 4));
            case "ingenieria en computacion":
                plan.add(new Materia("1120", "algebra", 8, 1));
                plan.add(new Materia("1121", "calculo y geometria analitica", 12, 1));
                plan.add(new Materia("1123", "quimica", 10, 1));
                plan.add(new Materia("1130", "fundamentos de fisica", 6, 1));
                plan.add(new Materia("1222", "fundamentos de programacion", 10, 1));
                plan.add(new Materia("8000", "igualdad de genero en ingenieria", 0, 1));
                plan.add(new Materia("1220", "algebra lineal", 8, 2));
                plan.add(new Materia("1221", "calculo integral", 8, 2));
                plan.add(new Materia("1228", "mecanica", 12, 2));
                plan.add(new Materia("1124", "redacción y exposicion de temas de ingenieria", 6, 2));
                plan.add(new Materia("1227", "estructura de datos y algoritmos I", 10, 2));
                plan.add(new Materia("1436", "probabilidad", 8, 3));
                plan.add(new Materia("1321", "calculo vectorial", 8, 3));
                plan.add(new Materia("1325", "ecuaciones diferenciales", 8, 3));
                plan.add(new Materia("1222", "cultura y comunicacion", 2, 3));
                plan.add(new Materia("1317", "estructura de datos y algoritmos II", 10, 3));
                plan.add(new Materia("1323", "programacion orientada a objetos", 10, 3));
                plan.add(new Materia("1445", "fundamentos de estadistica", 8, 4));
                plan.add(new Materia("1414", "electricidad y magnetismo", 10, 4));
                plan.add(new Materia("1424", "matematicas avanzadas", 8, 4));
                plan.add(new Materia("0119", "estructuras discretas", 8, 4));
            case "ingenieria electrica electronica":
                plan.add(new Materia("1120", "algebra", 8, 1));
                plan.add(new Materia("1121", "calculo y geometria analitica", 12, 1));
                plan.add(new Materia("1123", "quimica", 10, 1));
                plan.add(new Materia("1124", "redacción y exposicion de temas de ingenieria", 6, 1));
                plan.add(new Materia("1222", "fundamentos de programacion", 10, 1));
                plan.add(new Materia("8000", "igualdad de genero en ingenieria", 0, 1));
                plan.add(new Materia("1220", "algebra lineal", 8, 2));
                plan.add(new Materia("1221", "calculo integral", 8, 2));
                plan.add(new Materia("1228", "mecanica", 12, 2));
                plan.add(new Materia("1222", "cultura y comunicacion", 2, 2));
                plan.add(new Materia("1227", "estructura de datos y algoritmos I", 10, 2));
                plan.add(new Materia("1437", "termodinamica", 10, 3));
                plan.add(new Materia("1321", "calculo vectorial", 8, 3));
                plan.add(new Materia("1325", "ecuaciones diferenciales", 8, 3));
                plan.add(new Materia("1332", "modelos de programacion orientada a objetos", 10, 3));
                plan.add(new Materia("1436", "probabilidad", 8, 4));
                plan.add(new Materia("1414", "electricidad y magnetismo", 10, 4));
                plan.add(new Materia("1433", "analisis numerico", 8, 4));
                plan.add(new Materia("1443", "analisis de sistemas y señales", 10, 4));
                plan.add(new Materia("0944", "costos y evaluacion de proyectos", 6, 4));
            default:
                plan.add(new Materia("8000", "igualdad de genero en ingenieria", 0, 1));
                plan.add(new Materia("1120", "algebra", 8, 1));
                plan.add(new Materia("1121", "calculo y geometria analitica", 12, 1));
                plan.add(new Materia("1124", "redacción y exposicion de temas de ingenieria", 6, 1));
        }
    }
    
    public String getNombre() {return nombre; }
    public List<Materia> getPlan() {return Collections.unmodifiableList(plan); }
    
    public Materia buscarMateriaPorId(String id) {
        for (Materia m : plan) if (m.getId().equals(id)) return m;
        return null;
    }
}
