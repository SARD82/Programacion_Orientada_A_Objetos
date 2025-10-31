import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad(int cantidadComprada) {
        this.cantidad -= cantidadComprada;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Cantidad: " + cantidad;
    }
}

public class GestionProductosSinExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Consultar producto");
            System.out.println("3. Realizar compra");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                registrarProducto(sc, inventario);
            } else if (opcion == 2) {
                consultarProducto(sc, inventario);
            } else if (opcion == 3) {
                comprarProducto(sc, inventario);
            } else if (opcion == 4) {
                mostrarInventario(inventario);
            } else if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    public static void registrarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        Producto nuevo = new Producto(nombre, precio, cantidad);
        inventario.add(nuevo);
        System.out.println("✅ Producto registrado correctamente.");
    }

    public static void consultarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Nombre del producto a buscar: ");
        String nombre = sc.nextLine();
        Producto encontrado = null;

        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            System.out.println("✅ Producto encontrado: " + encontrado);
        } else {
            System.out.println("❌ El producto no existe en el inventario.");
        }
    }

    public static void comprarProducto(Scanner sc, ArrayList<Producto> inventario) {
        System.out.print("Nombre del producto a comprar: ");
        String nombre = sc.nextLine();
        Producto p = null;

        for (Producto prod : inventario) {
            if (prod.getNombre().equalsIgnoreCase(nombre)) {
                p = prod;
                break;
            }
        }

        if (p != null) {
            System.out.print("Unidades a comprar: ");
            int cantidad = Integer.parseInt(sc.nextLine());

            if (cantidad > p.getCantidad()) {
                System.out.println("❌ No hay suficientes unidades disponibles.");
            } else {
                p.reducirCantidad(cantidad);
                double total = p.getPrecio() * cantidad;
                System.out.println("✅ Compra realizada. Total a pagar: $" + total);
            }
        } else {
            System.out.println("❌ El producto no se encuentra.");
        }
    }

    public static void mostrarInventario(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("\n=== Inventario actual ===");
            for (Producto p : inventario) {
                System.out.println(p);
            }
        }
    }
}
