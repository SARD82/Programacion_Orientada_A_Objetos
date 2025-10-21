import java.util.ArrayList; // Necesario para usar ArrayList

public class MiListaDeCompras {
    public static void main(String[] args) {
        // Creamos un ArrayList que guardará Strings (los artículos de la compra)
        ArrayList<String> listaDeCompras = new ArrayList<>();
        
        listaDeCompras.add("Leche");
        listaDeCompras.add("Pan");
        listaDeCompras.add("Huevos");
        
        System.out.println("Lista de compras: " + listaDeCompras);
        
        String primerArticulo = listaDeCompras.get(0); // primerArticulo será "Leche"
        
        listaDeCompras.set(1, "Pan Integral"); // Cambia "Pan" por "Pan Integral"
        // Ahora la lista es: [Leche, Pan Integral, Huevos]
        
        listaDeCompras.remove(2); // Quita el elemento en el índice 2 ("Huevos")
        // Ahora la lista es: [Leche, Pan Integral]
        
        int numeroDeArticulos = listaDeCompras.size(); // numeroDeArticulos será 2
    }
}