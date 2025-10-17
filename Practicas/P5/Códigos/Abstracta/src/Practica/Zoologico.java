
package Practica;
import java.util.ArrayList;

public class Zoologico {
    
    private ArrayList<Animal> animales;
    
    public Zoologico(){
        animales = new ArrayList<>();
    }
    
    public void agregarAnimal(Animal a){
        animales.add(a);
    }
    
    public void mostrarAnimales(){
        for (Animal a : animales){
            System.out.println("-----------------------------");
            System.out.println(a.hacerSonido());
            System.out.println(a.edad);
            System.out.println(a.nombre);
        }
    }

}
