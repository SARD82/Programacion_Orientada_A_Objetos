
package Resultados;

public class Libro extends Material{
    
    @Override
    public String mostrarInfo(){
        return "Libro: " + titulo + ", Autor: " + autor;
    }
}