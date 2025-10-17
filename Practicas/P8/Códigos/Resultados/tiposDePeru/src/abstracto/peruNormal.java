
package abstracto;

public class peruNormal extends Bandera{
    public peruNormal() { 
        super("Rojo");
    }
    
    @Override
    public String simbolismo() {
        return "Preú Normal";
    }
    
    @Override
    public String hex() {
        return "#FF0000";
    }
}
