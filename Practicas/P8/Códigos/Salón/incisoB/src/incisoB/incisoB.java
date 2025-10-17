package incisoB;
import java.util.Scanner;

public class incisoB {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese una palabra");
            String palabra = sc.nextLine();
            
            // hay números??
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i); // Obtener caracter de la cadena
                if (c >= 'o' && c <= '9') {
                    throw new Exception("Error: No se permiten numeros, solo letras");
                } 
            }
            
            palabra = palabra.toLowerCase();
            int totalVocales = 0;
            int a = 0, e = 0, i = 0, o = 0, u = 0;
            
            for (int j = 0; j < palabra.length(); j++) {
                char c = palabra.charAt(j);
                switch (c) {
                    case 'a':
                        a++;
                        totalVocales++;
                        break;
                    case 'e':
                        e++;
                        totalVocales++;
                        break;
                    case 'i':
                        i++;
                        totalVocales++;
                        break;
                    case 'o':
                        o++;
                        totalVocales++;
                        break;
                    case 'u':
                        u++;
                        totalVocales++;
                        break;
                }
            }
            
            System.out.println("\n ==============");
            System.out.println("Vocales en " + palabra + " es: " + totalVocales);
            System.out.println("a: " + a);
            System.out.println("e: " + e);
            System.out.println("i: " + i);
            System.out.println("o: " + o);
            System.out.println("u: " + u);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
