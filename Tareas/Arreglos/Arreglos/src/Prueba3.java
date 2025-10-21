public class Prueba3 {
    public static void main(String[] args) {
        int[] calificaciones = {85, 52, 91, 60, 45};

        System.out.println("Resultados del examen:");
        for (int i = 0; i < calificaciones.length; i++) {
            String resultado = (calificaciones[i] >= 60) ? "Aprobado" : "Reprobado";
            System.out.println("Calificación " + calificaciones[i] + ": " + resultado);
        }
    }
}