package javaapplication1;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        
        
        Libro libro1 = new Libro("Harry Potter 1", "J. K Rowling", 309);
        libro1.mostrarInformacion();
        Libro libro2 = new Libro("Frankenstein", "Mary Shelley", 294);
        libro2.mostrarInformacion();
        
        Animal perro = new Animal("Teporocho", 5);
        perro.nombre = "Marihuano";
        perro.edad = 500;
        perro.cumplirAnios();
        
        CuentaBancaria cuenta1 = new CuentaBancaria(123456789,1323.23);
    }
}
class Libro {
    String titulo;
    String autor;
    int paginas;
    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void mostrarInformacion() {
        System.out.println("Tìtulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Pàginas: " + paginas);
    }
    
}

class Animal {
    String nombre;
    int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
}

class CuentaBancaria{
    int numeroCuenta;
    double saldo;
    
    public CuentaBancaria(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuànto desea depositar?");
        double agregar = sc.nextDouble();
        this.saldo += agregar;
    }
}