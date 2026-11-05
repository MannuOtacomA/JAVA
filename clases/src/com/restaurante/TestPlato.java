package com.restaurante;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plato platoA = new Plato();
		
		System.out.println("---Plato A Creado---");
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		platoA.nombre = "Chaulafan";
		platoA.tipo = "Entrada";
		platoA.precio = 12.00;
		platoA.disponible = true;
		
		System.out.println("---Plato A---");
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		Plato platoB = new Plato();
		
		System.out.println("---Plato B Creado---");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		platoB.nombre = "Langostinos";
		platoB.tipo = "Plato Fuerte";
		platoB.precio = 20.00;
		platoB.disponible = true;
		
		System.out.println("---Plato B---");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		Plato platoC = new Plato();
		
		System.out.println("---Plato C Creado---");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		
		platoC.nombre = "Helado de Chocolate";
		platoC.tipo = "Postre";
		platoC.precio = 3.00;
		platoC.disponible = true;
		
		System.out.println("---Plato C---");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		

	}

}
