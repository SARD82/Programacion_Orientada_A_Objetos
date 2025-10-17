
package abstracto;

public class peruVegano extends Bandera{
    public peruVegano() {
        super("Verde");
    }
    
    @Override
    public String simbolismo() {
        return "Perú Vegano";
    }
    
    @Override
    public String hex() {
        return "#0080000";
    }
}
