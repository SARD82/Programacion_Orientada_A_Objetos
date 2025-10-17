
package polimorfismo;

public class Bandera {
    private final String nombre;
    
    public Bandera(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String simbolismo() {
        return "Bandera genérica";
    }
    
    public String hex() {
        return "#000000";
    }
    
    @Override
    public String toString() {
        return nombre + " (" + hex() + ") " + simbolismo();
    }
}
