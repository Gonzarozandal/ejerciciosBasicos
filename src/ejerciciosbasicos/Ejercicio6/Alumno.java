package ejerciciosbasicos.Ejercicio6;


import java.util.Arrays;

public class Alumno {
    private String nombre;
    private String apellido;
    private final double[] notas;

    public Alumno(String nombre, String apellido, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = Arrays.copyOf(notas, notas.length);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        double sum = 0.0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }
}
