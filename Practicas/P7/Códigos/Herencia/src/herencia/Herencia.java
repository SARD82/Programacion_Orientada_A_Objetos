package herencia;

public class Herencia {

    public static void main(String[] args) {
            
        Empleado emple = new Empleado();
        
        emple.getNum_emp();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consultor();
        consul.getNombre();
    }
}