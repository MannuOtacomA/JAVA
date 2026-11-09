package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto("Blusa", 23.40);
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Precio: "+p1.getPrecio());
		
		 // precio negativo
        p1.setPrecio(-50);
        System.out.println("Precio de setPrecio(-50): " + p1.getPrecio());
		
        //calcularPrecioPromo
        double precioPromo = p1.calcularPrecioPromo(50.0);
        System.out.println("Precio con 50% descuento: " + precioPromo); // respuesta 25
        System.out.println("Precio inicial: " + p1.getPrecio());
		
		

	}

}
