package ejerciciosbasicos.Ejercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2001, 7, 7);
        CalculadoraEdad.calcularEdad(fechaNacimiento);
    }
}
