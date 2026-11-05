package com.krakedev;

public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo();
		r1.base = 5;
		r1.altura = 4;		
		int resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+resultadoArea);	
				
		Rectangulo r2 = new Rectangulo();
		r2.base = 2;
		r2.altura = 8;
		int resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: "+resultadoArea2);
		
		//perimetro
		Rectangulo p1 = new Rectangulo();
		p1.base = 4;
		p1.altura = 2;
		System.out.println("Periemtro es: "+p1.calcularPerimetro());
		

	}

}
