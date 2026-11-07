package com.krakedev;

public class testCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado(4);
		//c1.setLado(4);
		System.out.println("El area del cuadrado es: "+c1.calcularArea());
		
		Cuadrado c2 = new Cuadrado(3);
		//c2.setLado(3);
		System.out.println("El perimetro del cuadrado es: "+c2.calcularPerimetro());
		
		Cuadrado c3 = new Cuadrado(6);
		//c3.setLado(6);
		System.out.println("El perimetro del cuadrado es: "+c3.calcularPerimetro());

	}

}
