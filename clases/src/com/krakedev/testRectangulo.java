package com.krakedev;

public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo(5,4);
		//r1.setBase(5);
		//r1.setAltura(4);		
		int resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+resultadoArea);	
				
		Rectangulo r2 = new Rectangulo(2,8);
		//r2.setBase(2);
		//r2.setAltura(8);
		int resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: "+resultadoArea2);
		
		//perimetro
		Rectangulo p1 = new Rectangulo(4,2);
		//p1.setBase(4);
		//p1.setAltura(2);
		System.out.println("Periemtro es: "+p1.calcularPerimetro());
		

	}

}
