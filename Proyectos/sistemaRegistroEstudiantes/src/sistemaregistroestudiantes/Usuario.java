package sistemaregistroestudiantes;

public abstract class Usuario {
    String id;
    String nombre;
    String contrasena;

    public Usuario(String id, String nombre, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getContrasena() { return contrasena; }

    public abstract String hijos();
    public abstract void mostrarMenu();

}