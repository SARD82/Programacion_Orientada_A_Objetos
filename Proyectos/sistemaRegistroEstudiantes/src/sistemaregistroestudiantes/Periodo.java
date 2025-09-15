package sistemaregistroestudiantes;

import java.util.Objects;

public class Periodo implements Comparable<Periodo> {
    private final int anio;      
    private final int semestre;  

    public Periodo(int anio, int semestre) {
        if (semestre != 1 && semestre != 2) {
            throw new IllegalArgumentException("Semestre debe ser 1 o 2");
        }
        this.anio = anio;
        this.semestre = semestre;
    }

    public int getAnio() { return anio; }
    public int getSemestre() { return semestre; }

    @Override public String toString() {
        return anio + "-" + (semestre == 1 ? "1" : "2");
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Periodo)) return false;
        Periodo that = (Periodo) o;
        return anio == that.anio && semestre == that.semestre;
    }
    @Override public int hashCode() { return Objects.hash(anio, semestre); }

    @Override public int compareTo(Periodo o) {
        int c = Integer.compare(this.anio, o.anio);
        if (c != 0) return c;
        return Integer.compare(this.semestre, o.semestre);
    }
}
