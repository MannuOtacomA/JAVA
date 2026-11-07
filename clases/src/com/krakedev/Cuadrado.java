package com.krakedev;

public class Cuadrado {
	
	private double lado;
	private double resultadoArea;
	private double resultadoPerimetro;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getResultadoArea() {
		return resultadoArea;
	}

	public void setResultadoArea(double resultadoArea) {
		this.resultadoArea = resultadoArea;
	}

	public double getResultadoPerimetro() {
		return resultadoPerimetro;
	}

	public void setResultadoPerimetro(double resultadoPerimetro) {
		this.resultadoPerimetro = resultadoPerimetro;
	}
	
	//funciones

	public double calcularArea() {
		this.resultadoArea = (this.lado*= this.lado);
		return this.resultadoArea;
	}
	
	public double calcularPerimetro() {
		this.resultadoPerimetro = (this.lado * 4);
		return this.resultadoPerimetro;
	}

}
