
package abstracto;

public class peruLite extends Bandera{
    public peruLite() {
        super("Azul");
    }
    
    @Override
    public String simbolismo() {
        return "Perú Lite";
    }
    
    @Override
    public String hex() {
        return "#0000FF";
    }
}
