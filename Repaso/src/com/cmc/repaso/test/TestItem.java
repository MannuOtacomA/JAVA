package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ===== PRODUCTO 1: LAPTOP =====
        System.out.println("========== PRODUCTO 1: LAPTOP ==========");
        Item laptop = new Item();
        laptop.setNombre("Laptop HP");
        laptop.setProductosActuales(50);
        
        System.out.println("\n-- Estado Inicial --");
        laptop.imprimir();
        // Esperado: Actuales=50, Devueltos=0, Vendidos=0
        
        System.out.println("\n-- Después de vender 8 unidades --");
        laptop.vender(8);
        laptop.imprimir();
        // Esperado: Actuales=42, Devueltos=0, Vendidos=8
        
        System.out.println("\n-- Después de devolver 2 unidades --");
        laptop.devolver(2);
        laptop.imprimir();
        // Esperado: Actuales=44, Devueltos=2, Vendidos=6
        
        // ===== PRODUCTO 2: MOUSE =====
        System.out.println("\n========== PRODUCTO 2: MOUSE ==========");
        Item mouse = new Item();
        mouse.setNombre("Mouse Logitech");
        mouse.setProductosActuales(200);
        
        System.out.println("\n-- Estado Inicial --");
        mouse.imprimir();
        // Esperado: Actuales=200, Devueltos=0, Vendidos=0
        
        System.out.println("\n-- Después de vender 60 unidades --");
        mouse.vender(60);
        mouse.imprimir();
        // Esperado: Actuales=140, Devueltos=0, Vendidos=60
        
        System.out.println("\n-- Después de devolver 10 unidades --");
        mouse.devolver(10);
        mouse.imprimir();
        // Esperado: Actuales=150, Devueltos=10, Vendidos=50

	}

}
