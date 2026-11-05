package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		
		System.out.println("===Vehiculo 1 creado===");
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		System.out.println("Año: "+v.anio);
		System.out.println("Valor: "+v.valor);		
		
		System.out.println("===Vehiculo 1 valores asignados===");
		v.marca = "Toyota";
		v.modelo = "Hilux";
		v.anio = "2025";
		v.valor = 40.500;		
		
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		System.out.println("Año: "+v.anio);
		System.out.println("Valor: "+v.valor);
		
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("===Vehiculo 2 creado===");
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
		System.out.println("Año: "+v2.anio);
		System.out.println("Valor: "+v2.valor);		
		
		System.out.println("===Vehiculo 2 valores asignados===");
		v2.marca = "Ford";
		v2.modelo = "F150";
		v2.anio = "2025";
		v2.valor = 60.000;
		
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
		System.out.println("Año: "+v2.anio);
		System.out.println("Valor: "+v2.valor);
		
		
		
	}

}
