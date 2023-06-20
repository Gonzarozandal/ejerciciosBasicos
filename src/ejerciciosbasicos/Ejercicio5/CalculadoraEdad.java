package ejerciciosbasicos.Ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {
    public static void calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();
        System.out.println("La edad es: " + edad + " años.");
    }
}
