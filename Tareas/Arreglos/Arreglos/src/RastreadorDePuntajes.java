import java.util.Arrays; // Necesitamos importar esto para usar Arrays.toString()

public class RastreadorDePuntajes {
    public static void main(String[] args) {
        // 1. Crear un arreglo para 5 puntajes
        int[] puntajesAltos = new int[5];

        // 2. Llenar el arreglo con algunos valores usando sus índices
        puntajesAltos[0] = 980;
        puntajesAltos[1] = 850;
        puntajesAltos[2] = 720;
        puntajesAltos[3] = 600;
        puntajesAltos[4] = 510;

        // 3. Imprimir todos los puntajes de una manera bonita
        System.out.println("Lista de puntajes altos: " + Arrays.toString(puntajesAltos));

        // 4. Un nuevo jugador obtiene un mejor puntaje en la tercera posición
        System.out.println("\n¡Nuevo récord en la tercera posición!");
        puntajesAltos[2] = 750; // Actualizamos el valor en el índice 2

        // 5. Imprimir la lista actualizada
        System.out.println("Lista de puntajes actualizada: " + Arrays.toString(puntajesAltos));

        // 6. Recorrer el arreglo con un bucle 'for' para mostrar cada puntaje
        System.out.println("\nDetalle de puntajes:");
        for (int i = 0; i < puntajesAltos.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + puntajesAltos[i]);
        }
    }
}
