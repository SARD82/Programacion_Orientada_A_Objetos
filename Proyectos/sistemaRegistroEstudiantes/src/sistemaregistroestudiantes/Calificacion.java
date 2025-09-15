package sistemaregistroestudiantes;

public class Calificacion {
    private final Materia materia;
    private final Profesor profesor;
    private final Periodo periodo;
    private double valor;
    
    public Calificacion(Materia materia, Profesor profesor, Periodo periodo, double valor) {
        this.materia = materia;
        this.profesor = profesor;
        this.periodo = periodo;
        this.valor = valor;
    }
    
    public Materia getMateria() {return materia; }
    public Profesor getProfesor() {return profesor; }
    public Periodo getPeriodo() {return periodo; }
    public double getValor() {return valor; }
    public void setValor(double valor) {this.valor = valor; } // Para poder modificar la calificación 
}