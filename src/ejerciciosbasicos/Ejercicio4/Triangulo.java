package ejerciciosbasicos.Ejercicio4;

public class Triangulo {
    public double calcularArea(double lado1, double lado2, double lado3) {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
    }
}

