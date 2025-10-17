package Resultados;

public class Empleado extends Persona{
    
    int num_emp;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int num_emp, String cargo, Double sueldo, int id, String dni, 
            String nombre, String apellido, 
            String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_emp = num_emp;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Número de empleado: " + num_emp + ", Cargo: " + cargo + ", Sueldo: " + sueldo + ", ID: " + id + ", DNI: " + dni + ", Nombre: " + nombre + " " + apellido + ", Domicilio: " + domicilio + ", Telefono: " + telefono);
    }
}