package ejerciciosbasicos.Ejercicio3;

public class Persona {
    static int cant_Personas;
    String nombre;
    int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        cant_Personas++;
    }
    
    
    
}
