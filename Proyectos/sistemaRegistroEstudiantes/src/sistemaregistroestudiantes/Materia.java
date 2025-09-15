package sistemaregistroestudiantes;

import java.util.Objects;

public final class Materia {
    private final String id;
    private final String nombre;
    private final int creditos;
    private final int semestre;
    
    public Materia(String id, String nombre, int creditos, int semestre){
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.semestre = semestre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public int getSemestre() { return semestre; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + creditos + " Creditos, Semestre " + semestre + ") ";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia m = (Materia) o;
        return Objects.equals(id, m.id);
    }
    @Override 
    public int hashCode() {return Objects.hash(id); }
}