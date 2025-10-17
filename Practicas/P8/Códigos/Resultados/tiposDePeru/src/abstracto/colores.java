
package abstracto;

import java.util.List;

public class colores {

    public static void main(String args[]) {
        List<Bandera> colores = List.of(
          new peruNormal(), new peruLite(), new peruPremium(), new peruVegano(), new peruFestivo(), new peruCristiano()      
        );
        
        System.out.println("Tipos de perú:");
        for (Bandera c : colores) {
            System.out.println(" - " + c);
        }
    }
}
