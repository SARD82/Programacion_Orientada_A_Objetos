
package polimorfismo;

public class peruPremium extends Bandera{
    public peruPremium() {
        super("Rojo con hoja de maple");
    }
    
    @Override
    public String simbolismo() {
        return "Perú Premium";
    }
    
    @Override
    public String hex() {
        return "#8a0000";
    }
}
