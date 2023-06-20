package ejerciciosbasicos.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 9.0, 7.5, 9.5};
        Alumno alumno = new Alumno("Enzo", "Perez", notas);

        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Apellido: " + alumno.getApellido());
        System.out.println("Promedio: " + alumno.getPromedio());

        alumno.setNombre("Joaquin");
        alumno.setApellido("Martinez");

        System.out.println("Nombre actualizado: " + alumno.getNombre());
        System.out.println("Apellido actualizado: " + alumno.getApellido());
        
    }
}
