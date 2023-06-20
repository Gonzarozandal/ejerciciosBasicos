package ejerciciosbasicos.Ejercicio4;

public class Main {
   
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        double lado1 = 5.0;
        double lado2 = 4.0;
        double lado3 = 5.0;
        double area = triangulo.calcularArea(lado1, lado2, lado3);
        System.out.println("El área del triángulo es: " + area);
    }
}


