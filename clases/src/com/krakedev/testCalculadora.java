package com.krakedev;

public class testCalculadora {
    public static void main(String[] args) {
        // Suma
        Calculadora c1 = new Calculadora(5, 2);
        double r1 = c1.sumar();
        System.out.println("La suma es: " + r1);

        // Resta
        Calculadora c2 = new Calculadora(3, 4);
        int r2 = c2.restar();
        System.out.println("La resta es: " + r2);

        // Multiplica
        Calculadora c3 = new Calculadora(10, 5);
        double r3 = c3.multiplicar();
        System.out.println("La multiplicacion es: " + r3);

        // Divide
        Calculadora c4 = new Calculadora(10, 2);
        double r4 = c4.dividir();
        System.out.println("La division es: " + r4);

        // Promedio
        Calculadora c5 = new Calculadora(10, 8, 9);
        double r5 = c5.promediar();
        System.out.println("El total del promedio es: " + r5);

        // Mostrar resultado Ahorita no joven
        Calculadora c6 = new Calculadora(0, 0);
        System.out.print("El Mensaje es: ");
        c6.mostrarResultado();

        // Descuento: precio=100, descuento=50%
        Calculadora d1 = new Calculadora(100, 50);
        System.out.println("El precio final es: "+d1.calcularDescuento());
    }
}