public class Juego {
    public static void main(String[] args) {
        int[] vidasRestantes = {3, 1, 5, 0, 2};

        System.out.println("Estado de los jugadores:");
        for (int i = 0; i < vidasRestantes.length; i++) {
            int vidas = vidasRestantes[i];

            // Decidimos si añadir una 's' o no
            String pluralS = (vidas != 1) ? "s" : "";

            System.out.println("Jugador " + (i + 1) + ": Te queda" 
                + (vidas == 1 ? " " : "n ")   // Corrige el verbo: “queda” o “quedan”
                + vidas + " vida" + pluralS + ".");
        }
    }
}