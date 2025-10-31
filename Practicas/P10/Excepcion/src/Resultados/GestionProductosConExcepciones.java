import java.util.ArrayList;
import java.util.Scanner;

class DatoInvalidoException extends Exception {
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

public class GestionProductosConExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {

            // try-catch-finally para controlar el ciclo
            try {
                System.out.println("\n=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");
                System.out.println("1. Registrar producto");
                System.out.println("2. Consultar producto");
                System.out.println("3. Realizar compra");
                System.out.println("4. Mostrar inventario");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción: ");

                // Capturar NumberFormatException
                int opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    registrarProducto(sc, inventario); // puede lanzar DatoInvalidoException
                } else if (opcion == 2) {
                    consultarProducto(sc, inventario);  // puede lanzar NullPointerException
                } else if (opcion == 3) {
                    comprarProducto(sc, inventario);    // puede lanzar IllegalArgumentException
                } else if (opcion == 4) {
                    mostrarInventario(inventario);
                } else if (opcion == 5) {
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                } else {
                    System.out.println("Opción no válida.");
                }

            // NumberFormatException
            } catch (NumberFormatException e) {
                System.out.println("Error: debes ingresar un número donde se pide número.");

            // DatoInvalidoException
            } catch (DatoInvalidoException e) {
                System.out.println("Error Dato inválido: " + e.getMessage());

            // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Error: El producto no existe en el inventario.");

            // atrapar la de compra
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Operación concluida.\n");
            }
        }

        sc.close();
    }

    // valida precio y cantidad y lanza DatoInvalidoException
    public static void registrarProducto(Scanner sc, ArrayList<Producto> inventario) throws DatoInvalidoException {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine()); // puede lanzar NumberFormatException

        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());    // puede lanzar NumberFormatException

        if (precio < 0 || cantidad < 0) {
            throw new DatoInvalidoException("Error: El precio y la cantidad deben ser positivos.");
        }

        Producto nuevo = new Producto(nombre, precio, cantidad);
        inventario.add(nuevo);
        System.out.println("Producto registrado correctamente.");
    }

    // si no encuentra, lanza NullPointerException
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

        if (encontrado == null) {
            throw new NullPointerException("Error: Producto no encontrado");
        } else {
            System.out.println("Producto encontrado: " + encontrado);
        }
    }

    // valida unidades y lanza IllegalArgumentException
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

        if (p == null) {
            // mismo criterio que en consultar
            throw new NullPointerException("Error: Producto no encontrado para compra");
        }

        System.out.print("Unidades a comprar: ");
        int cantidad = Integer.parseInt(sc.nextLine()); // puede lanzar NumberFormatException

        if (cantidad > p.getCantidad()) {
            throw new IllegalArgumentException("Error: No hay suficientes unidades disponibles.");
        }

        p.reducirCantidad(cantidad);
        double total = p.getPrecio() * cantidad;
        System.out.println("Compra realizada. Total a pagar: $" + total);
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
