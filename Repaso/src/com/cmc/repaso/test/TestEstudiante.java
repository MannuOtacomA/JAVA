package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante("Elizabeth Paredes");
		System.out.println(e1.getNombre());
		e1.calificar(10);
		System.out.println(e1.getResultado());		
		e1.calificar(5);
		System.out.println(e1.getResultado());

	}

}
