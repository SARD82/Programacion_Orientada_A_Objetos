
package Resultados;


public class Revista extends Material{

    @Override
    public String mostrarInfo(){
        return "Libro: " + titulo + ", Autor: " + autor;
    }
}