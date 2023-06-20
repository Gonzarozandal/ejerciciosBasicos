package ejerciciosbasicos.Ejercicio2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Operaciones con enteros
        int a = 10;
        int b = 5;

        Calculadora calculadora = new Calculadora();

        int sumaEnteros = calculadora.sumar(a, b);
        int restaEnteros = calculadora.restar(a, b);
        int multiplicacionEnteros = calculadora.multiplicar(a, b);
        int divisionEnteros = calculadora.dividir(a, b);

        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Resta de enteros: " + restaEnteros);
        System.out.println("Multiplicación de enteros: " + multiplicacionEnteros);
        System.out.println("División de enteros: " + divisionEnteros);
        System.out.println("------------------------------------------------");
        // Operaciones con flotantes
        float x = 3.5f;
        float y = 2.2f;

        float sumaFlotantes = calculadora.sumar(x, y);
        float restaFlotantes = calculadora.restar(x, y);
        float multiplicacionFlotantes = calculadora.multiplicar(x, y);
        float divisionFlotantes = calculadora.dividir(x, y);

        System.out.println("Suma de flotantes: " + sumaFlotantes);
        System.out.println("Resta de flotantes: " + restaFlotantes);
        System.out.println("Multiplicación de flotantes: " + multiplicacionFlotantes);
        System.out.println("División de flotantes: " + divisionFlotantes);
        
        System.out.println("------------------------------------------------");

        // Operaciones con números complejos
        Complejo c1 = new Complejo(2.0, 3.0);
        Complejo c2 = new Complejo(1.5, 2.5);

        Complejo sumaComplejos = calculadora.sumar(c1, c2);
        Complejo restaComplejos = calculadora.restar(c1, c2);
        Complejo multiplicacionComplejos = calculadora.multiplicar(c1, c2);
        Complejo divisionComplejos = calculadora.dividir(c1, c2);

        System.out.println("Suma de complejos: " + sumaComplejos.getReal() + " + " + sumaComplejos.getImaginario() + "i");
        System.out.println("Resta de complejos: " + restaComplejos.getReal() + " + " + restaComplejos.getImaginario() + "i");
        System.out.println("Multiplicación de complejos: " + multiplicacionComplejos.getReal() + " + " + multiplicacionComplejos.getImaginario() + "i");
        System.out.println("División de complejos: " + divisionComplejos.getReal() + " + " + divisionComplejos.getImaginario() + "i");
        
        System.out.println("------------------------------------------------");

    }
}


