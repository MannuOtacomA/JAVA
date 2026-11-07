package com.krakedev;

public class Rectangulo {
	
	private int base;
	private int altura;
	private int area;
	private double perimetro;
    
    	
	public Rectangulo(int base, int altura) {		
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	//funciones

	public int calcularArea() {
		this.area = this.base * this.altura;		
		return this.area;
	}
	
	public double calcularPerimetro() {
		this.perimetro = (this.base * 2)+(this.altura * 2);
		return this.perimetro;
	}

}
