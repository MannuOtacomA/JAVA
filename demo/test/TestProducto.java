package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(123, "Eli Paredes");
		p1.setDescripcion("Peso de Elizabeth");
		p1.setPeso(150);
		
		System.out.println("Codigo: "+p1.getCodigo());
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Descripcion: "+p1.getDescripcion());
		System.out.println("Peso: "+p1.getPeso()+" Libras");

	}

}
