package ejerciciosbasicos.Ejercicio7;

public class Division {
    public static double dividir(int dividendo, int divisor) {
        try {
            double resultado = dividendo / divisor;
            return resultado;
        } catch (ArithmeticException ex) {
            System.out.println("Error: no se puede dividir entre cero");
            return 0;
        }
    }
}