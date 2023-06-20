package ejerciciosbasicos.Ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Roberto", 20000,"Ingeniero", LocalDate.now());        
        System.out.println("Nombre del empleado: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.salario);
        System.out.println("Puesto de trabajo: " + empleado1.puesto);
        System.out.println("Fecha de contratacion: " + empleado1.fechaDeContratacion);
    }
    
}
