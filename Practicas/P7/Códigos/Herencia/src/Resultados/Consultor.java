package Resultados;

public class Consultor extends Persona {
    
String nombre_consultor;
int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_consultor, int num_consultor) {
        this.nombre_consultor = nombre_consultor;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del consultor: " + nombre_consultor + ", Número del consultor: " + num_consultor);
    }
}