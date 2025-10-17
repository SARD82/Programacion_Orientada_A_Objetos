
package Practica;

public class Main {

    public static void main(String args[]) {
        Zoologico zol = new Zoologico();
        
        Perro perro1 = new Perro();
        perro1.edad = 10;
        perro1.nombre = "Joaquin";
        
        Gato gato1 = new Gato();
        gato1.edad = 34;
        gato1.nombre = "tontin";
        
        zol.agregarAnimal(perro1);
        zol.agregarAnimal(gato1);
        
        zol.mostrarAnimales();
    }
}
