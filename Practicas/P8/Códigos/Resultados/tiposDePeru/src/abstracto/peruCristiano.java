
package abstracto;

public class peruCristiano extends Bandera{
    public peruCristiano() {
        super("Rojo con una cruz");
    }
    
    @Override
    public String simbolismo() {
        return "Perú Cristiano";
    }
    
    @Override
    public String hex() {
        return "#eb0514";
    }
}

