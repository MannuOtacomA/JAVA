package com.restaurante;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante rest1 = new Restaurante();		
		rest1.nombre = "El Buen Sabor";
		rest1.direccion = "Calle Amazonas";
		rest1.calificacion = 5.0;
		
		System.out.println("---Restaurante 1---");
		System.out.println("Nombre: "+rest1.nombre);
		System.out.println("Direccion: "+rest1.direccion);
		System.out.println("Calificacion: "+rest1.calificacion);
		
		
		Restaurante rest2 = new Restaurante();		
		rest2.nombre = "El Picon";
		rest2.direccion = "Calle 10 de Agosto";
		rest2.calificacion = 8.0;
		
		System.out.println("---Restaurante 2---");
		System.out.println("Nombre: "+rest2.nombre);
		System.out.println("Direccion: "+rest2.direccion);
		System.out.println("Calificacion: "+rest2.calificacion);

	}

}
