
package abstracto;

public class peruFestivo extends Bandera{
    public peruFestivo() {
        super("Verde con un pino");
    }
    
    @Override
    public String simbolismo() {
        return "Perú Festivo";
    }
    
    @Override
    public String hex() {
        return "#1e9104";
    }
}
