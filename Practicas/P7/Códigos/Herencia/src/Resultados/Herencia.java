package Resultados;

public class Herencia {

    public static void main(String[] args) {
        
        
        Empleado emple1 = new Empleado();
        emple1.num_emp = 1;
        emple1.cargo = "Becario";
        emple1.sueldo = 10000.24;
        emple1.id = 1000;
        emple1.dni = "B1";
        emple1.nombre = "Javier";
        emple1.apellido = "Flores";
        emple1.domicilio = "Av. Ingeniería";
        emple1.telefono = "5567983615";
        emple1.mostrarInfo();
        
        Empleado emple2 = new Empleado();
        emple2.num_emp = 2;
        emple2.cargo = "Pasante";
        emple2.sueldo = 10500.24;
        emple2.id = 2000;
        emple2.dni = "P1";
        emple2.nombre = "Antonio";
        emple2.apellido = "Garcia";
        emple2.domicilio = "Av. Medicina";
        emple2.telefono = "5543876340";
        emple2.mostrarInfo();
        
        Consultor consul1 = new Consultor();
        consul1.nombre_consultor = "Toño";
        consul1.num_consultor = 10;
        consul1.mostrarInfo();
        
        Consultor consul2 = new Consultor();
        consul2.nombre_consultor = "Arturo";
        consul2.num_consultor = 20;
        consul2.mostrarInfo();
        
        Jefe chief = new Jefe();
        chief.id_jefe = 0000000;
        chief.departamento_jefe = "Consultores";
        chief.id = 100;
        chief.dni = "J1";
        chief.nombre = "Santiago";
        chief.apellido = "Rendón";
        chief.domicilio = "Av. Derecho";
        chief.telefono = "5587095612";
        chief.mostrarInfo();
        
    }
}