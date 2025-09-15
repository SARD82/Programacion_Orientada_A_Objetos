package javaapplication1.p3;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class salon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n===== MENÙ DE PRÀCTICAS =====");
            System.out.println("1. Arreglos");
            System.out.println("2. Cadenas");
            System.out.println("3. Colecciones");
            System.out.println("4. ArrayList");
            System.out.println("5. Hashtable");
            System.out.println("6. Math, Date y Calendar");
            System.out.println("Elige una opciòn");
            opcion = sc.nextInt();
            sc.nextLine(); //limpiar buffer
            
            switch (opcion) {
                case 1:
                    ejemploArreglos();
                    break;
                case 2:
                    ejemploCadenas();
                    break;
                case 3:
                    ejemploColecciones();
                    break;
                case 4:
                    ejemploArrayList();
                    break;
                case 5:
                    ejemploHashtable();
                    break;
                case 6:
                    ejemploMathFecha();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opciòn no vàlida");
            } 
        } while (opcion != 0);
    }
    
    // 1. Arreglos
    public static void ejemploArreglos(){
        int[] numeros = {10, 20, 30, 40};
        System.out.println("Primer elemento: " + numeros[0]);
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ":" + numeros[i]);
        }
    }
    
    //2. Cadenas
    public static void ejemploCadenas() {
        String texto = "hola mundo";
        System.out.println("Longitud: " + texto.length());
        System.out.println("Mayùsculas: " + texto.toUpperCase());
        
        String saludo = texto + "desde Java";
        System.out.println("Concatenado " + saludo);
        
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" ").append("Mundo");
        System.out.println("Con append: " + sb);
        
        Integer numero = Integer.valueOf("123");
        System.out.println("Wrapper Interger: " + (numero + 10));
    }
    
    //3. Colecicciones
    public static void ejemploColecciones() {
        List<String> frutas = new ArrayList <>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Mango");
        
        System.out.println("Primer fruta: " + frutas.get(0));
        System.out.println("Posiciòn de mango: " + frutas.indexOf("Mango"));
        
        frutas.remove("Pera");
        
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
    
    //4. ArrayList
    public static void ejemploArrayList() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        
        System.out.println("Elemento en 1: " + lista.get(1));
        System.out.println("Tamaño: " + lista.size());
        
        lista.remove("Verde");
        System.out.println("Index de Azul: " + lista.indexOf("Azul"));
        
        lista.clear();
        System.out.println("¿Lista vacia?" + lista.isEmpty());
    }
    
    // 5. Hashtable
    public static void ejemploHashtable() {
        Hashtable<Integer, String> tabla = new Hashtable<>();
        tabla.put(1,"Uno");
        tabla.put(2,"Dos");
        tabla.put(3,"Tres");
        
        System.out.println("Clave 2: " + tabla.get(2));
        
        for (Integer clave : tabla.keySet()) {
            System.out.println(clave + " -> " + tabla.get(clave));
        }
    }
    
    //6. Math, Date y Calendar
    public static void ejemploMathFecha() {
        System.out.println("2^3 = " + Math.pow(2,3));
        System.out.println("Raìz de 16 = " + Math.sqrt(16));
        
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha);
        
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.SEPTEMBER, 4);
        System.out.println("Fecha personalizada: " + cal.getTime());
    }
}
