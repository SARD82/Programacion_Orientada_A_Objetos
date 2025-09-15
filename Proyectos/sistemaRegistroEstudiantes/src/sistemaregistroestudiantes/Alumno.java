package sistemaregistroestudiantes;

import java.util.*;

public class Alumno extends Usuario {
    String carrera;

    private final Carrera carreraPlan;

    private final List<Calificacion> historial = new ArrayList<>();

    public Alumno(String id, String nombre, String contrasena, String carrera) {
        super(id, nombre, contrasena);
        this.carrera = carrera;
        this.carreraPlan = new Carrera(carrera);
    }

    public void verPlanEstudios() {
        System.out.println("\n=== Plan de estudios (" + carreraPlan.getNombre() + ") ===");
        //Ordenar
        List<Materia> plan = new ArrayList<>(carreraPlan.getPlan());
        plan.sort(Comparator.comparing(Materia::getSemestre).thenComparing(Materia::getNombre));
        for (Materia m : plan) {
            System.out.printf("Sem %d | [%s] %s (%d cr)\n",
                    m.getSemestre(), m.getId(), m.getNombre(), m.getCreditos());
        }
    }

    public Carrera getCarreraPlan() { return carreraPlan; }

    public List<Calificacion> getHistorial() {
        return Collections.unmodifiableList(historial);
    }

    void upsertCalificacion(Calificacion c) {
        for (int i = 0; i < historial.size(); i++) {
            Calificacion e = historial.get(i);
            if (e.getMateria().equals(c.getMateria()) &&
                e.getPeriodo().equals(c.getPeriodo())) {
                historial.set(i, c);
                return;
            }
        }
        historial.add(c);
    }

    public void mostrarHistorialAcademico() {
        if (historial.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }
        Map<Periodo, List<Calificacion>> porPeriodo = new TreeMap<>();
        for (Calificacion c : historial) {
            porPeriodo.computeIfAbsent(c.getPeriodo(), k -> new ArrayList<>()).add(c);
        }
        System.out.println("\n=== Historial Académico de " + getNombre() + " ===");
        for (Map.Entry<Periodo, List<Calificacion>> e : porPeriodo.entrySet()) {
            System.out.println("Periodo: " + e.getKey());
            e.getValue().sort(Comparator
                    .comparing((Calificacion c) -> c.getMateria().getSemestre())
                    .thenComparing(c -> c.getMateria().getNombre()));
            for (Calificacion c : e.getValue()) {
                Materia m = c.getMateria();
                System.out.printf("  [%s] %s (Sem %d, %d cr) -> %.2f (Prof: %s)%n",
                        m.getId(), m.getNombre(), m.getSemestre(), m.getCreditos(),
                        c.getValor(), c.getProfesor().getNombre());
            }
        }
    }

    @Override
    public String hijos() { return "Alumno"; }

    @Override
    public void mostrarMenu() {
        System.out.println("\n=== Menú Alumno ===");
        System.out.println("1. Ver plan de estudios");
        System.out.println("2. Ver historial académico");
        System.out.println("3. Cerrar sesión");
    }
}