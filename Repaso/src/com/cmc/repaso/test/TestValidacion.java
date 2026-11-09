package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validacion v1 = new Validacion();
		System.out.println(v1.validarMonto(89));
		System.out.println(v1.validarMonto(0));
		System.out.println(v1.validarMonto(-10));

	}

}
