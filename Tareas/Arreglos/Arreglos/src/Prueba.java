public class Prueba {
    public static void main(String[] args) {
        int puntaje = 1200;
        String mensaje;

        if (puntaje > 1000) {
            mensaje = "¡Felicidades! ¡Ganaste un bono!";
        } else {
            mensaje = "Sigue intentando para ganar un bono.";
        }

        System.out.println(mensaje);
    }
}