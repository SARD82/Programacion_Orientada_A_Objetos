package sistemaregistroestudiantes;

public class Administrador extends Usuario {
    public Administrador(String id, String nombre, String contrasena) {
        super(id, nombre, contrasena);
    }

    @Override
    public String hijos() { return "Administrador"; }

    @Override
    public void mostrarMenu() {
        System.out.println("\n=== Menú Administrador ===");
        System.out.println("1. Ver todos los usuarios");
        System.out.println("2. Cerrar sesión");
    }
}