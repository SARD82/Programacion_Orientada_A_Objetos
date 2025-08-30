import java.util.Scanner;
public class resultadosp2 {


    public static void main(String args[]) {
        for(int i = 0; i<7; i++){ //1 += 2 para aumentar de 2 en 2
            System.out.println("alo? "+ i);
        }
        
        int inicio = 0;
        int fin = 10;
        while(inicio < fin){
            System.out.println("hola? "+fin);
            inicio++;
            fin -= 2; //fin = fin - 2
        }
        
        int num1 = 0;
        int num2 = 9;
        int count = 0;
        do {
            count++;
            num1++;
            System.out.println("Alo "+count);
        } while (num1 < num2);
        
        // IFs
        boolean casado = false;
        boolean soltero = true;
        int hijos = 0;
        if (casado && hijos >= 1) {
            System.out.println("Huye!!!");
        }
        if (casado && hijos >= 1) {
            System.out.println("Quien tenga miedo a morir que no nazca");
        }
        if ((!casado && soltero) && hijos >= 1) {
            System.out.println("No puedes ni contigo, huye!!!");
        }
        if (soltero && hijos < 1) {
            System.out.println("No existe son los papás");
        }
        
        // Switch case
       Scanner sc = new Scanner(System.in); 
       
        System.out.println("Jalas o  te rajas:");
        System.out.println("1. Casado y con hijo??");
        System.out.println("2. Casado y tiene hijos??");
        System.out.println("3. Soltero y con hijos");
        System.out.println("4. Soltero y sin hijos");
        System.out.println("Elige una opción:");
        
        int option = sc.nextInt();
        
        switch(option) {
            case 1:
                System.out.println("Huye!!!");
                break;
            case 2:
                System.out.println("Quien tenga miedo a morir que no nazca");
                break;
            case 3:
                System.out.println("No puedes ni contigo, huye!!!");
                break;
            case 4:
                System.out.println("No existe, son los papás");
                break;
            default:
                System.out.println("Opción no válida");
        }
    sc.close();
    }
}
