
public class Scores {

    public static void main(String args[]) {
        int puntaje1 = 1500;
        int puntaje2 = 1250;
        int puntaje3 = 1100;
        int puntaje4 = 1200;
        int puntaje5 = 1890;
        int puntaje6 = 1340;
        int puntaje7 = 1000;
        int puntaje8 = 1900;
        int puntaje9 = 2000;
        int puntaje10 = 1700;
        
        // Creamos un arreglo llamado 'puntajesAltos' que puede contener 5 números enteros.
        int puntajesAltos[] = new int[5];
        
        // Creamos un arreglo de Strings y lo llenamos inmediatamente.
        String[] equipo = {"Ana", "Juan", "María"};

        // Para acceder al primer elemento (índice 0)
        System.out.println(equipo[0]); // Imprimirá "Ana"

        // Para acceder al tercer elemento (índice 2)
        System.out.println(equipo[1]); // Imprimirá "María"

        // Para cambiar el valor en el segundo casillero (índice 1)
        equipo[1] = "Pedro";
        System.out.println(equipo[1]); // Ahora imprimirá "Pedro"

        // Para saber el tamaño del arreglo
        System.out.println(equipo.length); // Imprimirá 3
    }
}
