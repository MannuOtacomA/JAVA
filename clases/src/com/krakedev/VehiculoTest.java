package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		
		System.out.println("===Vehiculo 1 creado===");
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Año: "+v.getAnio());
		System.out.println("Valor: "+v.getValor());		
		
		System.out.println("===Vehiculo 1 valores asignados===");
		v.setMarca("Toyota");
		v.setModelo("Hilux");
		v.setAnio("2025");
		v.setValor(40.500);		
		
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Año: "+v.getAnio());
		System.out.println("Valor: "+v.getValor());	
		
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("===Vehiculo 2 creado===");
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Valor: "+v2.getValor());		
		
		System.out.println("===Vehiculo 2 valores asignados===");
		v2.setMarca("Ford");
		v2.setModelo("F150");
		v2.setAnio("2025");
		v2.setValor(60.000);
		
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Valor: "+v2.getValor());	
		
		
		
	}

}
