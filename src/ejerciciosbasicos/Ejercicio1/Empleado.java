package ejerciciosbasicos.Ejercicio1;

import java.time.LocalDate;


public class Empleado {
  String nombre;
  int salario;
  String puesto;
  LocalDate fechaDeContratacion;
  
  public Empleado(String nombre, int salario) {
    this.nombre = nombre;
    this.salario = salario;
  }

  public Empleado(String nombre, int salario, String puesto) {
    this.nombre = nombre;
    this.salario = salario;
    this.puesto = puesto;
  }

  public Empleado(String nombre, int salario, String puesto, LocalDate fechaDeContratacion) {
    this.nombre = nombre;
    this.salario = salario;
    this.puesto = puesto;
    this.fechaDeContratacion = fechaDeContratacion;
  }
}
