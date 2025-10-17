
package trycatch;
class MiException extends Exception{
    public MiException(String mensaje){
        super(mensaje);
    }
}

public class Ejemplo8 {
    public static void verificar(int numero) throws MiException{
        if (numero < 0){
            throw new MiException("No se permiten números negativos.");
        }
    }
    
    public static void main(String args[]) {
        try{
            verificar(-5);
        } catch (MiException e){
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
