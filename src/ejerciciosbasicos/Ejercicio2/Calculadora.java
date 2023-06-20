package ejerciciosbasicos.Ejercicio2;

public class Calculadora {
    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de dos flotantes
    public float sumar(float a, float b) {
        return a + b;
    }

    // Suma de dos números complejos
    public Complejo sumar(Complejo a, Complejo b) {
        double real = a.getReal() + b.getReal();
        double imaginario = a.getImaginario() + b.getImaginario();
        return new Complejo(real, imaginario);
    }

    // Resta de dos enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Resta de dos flotantes
    public float restar(float a, float b) {
        return a - b;
    }

    // Resta de dos números complejos
    public Complejo restar(Complejo a, Complejo b) {
        double real = a.getReal() - b.getReal();
        double imaginario = a.getImaginario() - b.getImaginario();
        return new Complejo(real, imaginario);
    }

    // Multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplicación de dos flotantes
    public float multiplicar(float a, float b) {
        return a * b;
    }

    // Multiplicación de dos números complejos
    public Complejo multiplicar(Complejo a, Complejo b) {
        double real = (a.getReal() * b.getReal()) - (a.getImaginario() * b.getImaginario());
        double imaginario = (a.getReal() * b.getImaginario()) + (a.getImaginario() * b.getReal());
        return new Complejo(real, imaginario);
    }

    // División de dos enteros
    public int dividir(int a, int b) {
        return a / b;
    }

    // División de dos flotantes
    public float dividir(float a, float b) {
        return a / b;
    }

    // División de dos números complejos
    public Complejo dividir(Complejo a, Complejo b) {
        double divisor = Math.pow(b.getReal(), 2) + Math.pow(b.getImaginario(), 2);
        double real = ((a.getReal() * b.getReal()) + (a.getImaginario() * b.getImaginario())) / divisor;
        double imaginario = ((a.getImaginario() * b.getReal()) - (a.getReal() * b.getImaginario())) / divisor;
        return new Complejo(real, imaginario);
    }
}

