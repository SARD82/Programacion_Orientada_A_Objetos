package sistemaregistroestudiantes;

public class Profesor extends Usuario {
    String materia;

    public Profesor(String id, String nombre, String contrasena, String materia) {
        super(id, nombre, contrasena);
        this.materia = materia;
    }

    public void asignarCalificacion(Alumno alumno, Materia materia, Periodo periodo, double valor) {
        if (alumno == null) throw new IllegalArgumentException("alumno nulo");
        if (materia == null) throw new IllegalArgumentException("materia nula");
        if (periodo == null) throw new IllegalArgumentException("periodo nulo");
        if (valor < 0 || valor > 10) throw new IllegalArgumentException("La calificación debe estar entre 0 y 10");

        Calificacion c = new Calificacion(materia, this, periodo, valor);
        alumno.upsertCalificacion(c);
    }

    @Override
    public String hijos() { return "Profesor"; }

    @Override
    public void mostrarMenu() {
        System.out.println("\n=== Menu Profesor ===");
        System.out.println("1. Subir calificación");
        System.out.println("2. Cerrar sesión");
    }
}