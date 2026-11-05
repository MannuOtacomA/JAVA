package com.krakedev;

public class testCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();		
		double r1 = c1.sumar(5, 2);		
		System.out.println("La suma es: "+r1);
		
		Calculadora c2 = new Calculadora();
		int r2 = c2.restar(3, 4);
		System.out.println("La resta es: "+r2);
		
		Calculadora c3 = new Calculadora();
		double r3 = c3.multiplicar(10, 5);
		System.out.println("El producto de la multiplicación: "+r3);
		
		Calculadora c4 = new Calculadora();
		double r4 = c4.dividir(10, 2);
		System.out.println("El cociente de la división: "+r4);
		
		Calculadora c5 = new Calculadora();
		double r5 = c5.promediar(10,8,9);
		System.out.println("El total del promedio: "+r5);
		
		Calculadora c6 = new Calculadora();
		c6.mostrarResultado();

	}

}
