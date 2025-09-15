package javaapplication1.p3;

import java.util.*;

public class resultadosp3 {
    public static void main(String[] args) {
        arreglos();
        cadenas();
        colecciones();
        arrayList();
        hashTable();
        mate();
    }

    static void titulo(String t) { System.out.println("\n=== " + t + " ==="); }

    // 1. Arreglos
    static void arreglos() {
        titulo("1) Arreglos");
        String[] reprobados = {"Santiago", "Josue", "Moises", "Mafer"};
        System.out.println("Inicial: " + Arrays.toString(reprobados));

        //Añadir a Ari
        String[] reprobadosMas = Arrays.copyOf(reprobados, reprobados.length + 1);
        reprobadosMas[reprobadosMas.length - 1] = "Ari";
        System.out.println("Añadiendo Ari: " + Arrays.toString(reprobadosMas));

        // Quitarme
        List<String> lista = new ArrayList<>(Arrays.asList(reprobadosMas));
        lista.remove("Santiago");
        System.out.println("Quitando Santiago: " + lista);
    }

    // 2. Cadenas
    static void cadenas() {
        titulo("2) Cadenas");
        //compareTo
        String a = "hola", b = "holA";
        System.out.println("compareTo(\"" + a + "\", \"" + b + "\") = " + a.compareTo(b));

        //lastIndexOf
        String texto = "programacion orientada a objetos";
        System.out.println("lastIndexOf('o') = " + texto.lastIndexOf('o'));

        //endsWith
        System.out.println("endsWith(\"tos\") = " + texto.endsWith("tos"));

        //substring
        System.out.println("substring(0, 11) = \"" + texto.substring(0, 11) + "\"");
    }

    // 3. Colecciones
    static void colecciones() {
        titulo("3) Colecciones");
        //HashSet: sin orden, sin duplicados
        Set<String> hs = new HashSet<>();
        hs.add("A"); hs.add("B"); hs.add("C"); hs.add("A"); // duplicado ignorado
        System.out.println("HashSet: " + hs);

        //TreeSet: ordenado, sin duplicados (mostrar efecto de duplicados)
        Set<String> ts = new TreeSet<>();
        ts.add("G"); ts.add("E"); ts.add("E"); ts.add("A");
        System.out.println("TreeSet (ordenado, sin duplicados): " + ts);
    }

    // 4. ArrayList
    static void arrayList() {
        titulo("4) ArrayList");
        ArrayList<String> ex = new ArrayList<>(Arrays.asList(
                "Montse", "Giselle", "Itzel", "Fernanda", "Andrea"));
        System.out.println("Inicial: " + ex);

        //Eliminar 1 y agregar 1
        ex.remove("Fernanda");
        ex.add("Maria fernanda");
        System.out.println("Actualizado: " + ex);
    }

    // 5. HashTable
    static void hashTable() {
        titulo("5) Hashtable");
        Hashtable<Integer, String> tabla = new Hashtable<>();
        tabla.put(10, "Diez");
        tabla.put(20, "Veinte");
        tabla.put(30, "Treinta");

        //Aplicar out → imprimir el contenido
        System.out.println("Contenido: " + tabla);

        //Contains → containsKey / containsValue
        System.out.println("containsKey(20): " + tabla.containsKey(20));
        System.out.println("containsValue(\"Treinta\"): " + tabla.containsValue("Treinta"));
    }

    // 6. Mate (Math)
    static void mate() {
        titulo("6) Mate (Math)");
        int x = -42, y = 17;
        System.out.println("abs(" + x + ") = " + Math.abs(x));
        System.out.println("max(" + x + ", " + y + ") = " + Math.max(x, y));
        System.out.println("min(" + x + ", " + y + ") = " + Math.min(x, y));

        double r = Math.random();
        System.out.println("random() = " + r);

        double v = 3.6;
        System.out.println("round(3.6) = " + Math.round(v));
    }
}
