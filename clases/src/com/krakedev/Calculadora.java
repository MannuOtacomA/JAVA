package com.krakedev;

public class Calculadora {
	
	private double resultadoDouble;
	private int resultadoInt;
	
	public double getResultadoDouble() {
		return resultadoDouble;
	}

	public void setResultadoDouble(double resultadoDouble) {
		this.resultadoDouble = resultadoDouble;
	}

	public int getResultadoInt() {
		return resultadoInt;
	}

	public void setResultadoInt(int resultadoInt) {
		this.resultadoInt = resultadoInt;
	}
	
	//---funciones

	public double sumar(int a,int b) {
		this.resultadoDouble = a + b;
		return this.resultadoDouble;		
	}
	
	public int restar(int a,int b) {
		this.resultadoInt = a - b;
		return this.resultadoInt;		
	}
	
	public double multiplicar(double valor1,double valor2) {
		this.resultadoDouble = valor1 * valor2;
		return this.resultadoDouble;		
	}
	
	public double dividir(double dividiendo,double divisor) {
		this.resultadoDouble = dividiendo / divisor;
		return this.resultadoDouble;		
	}
	
	public double promediar(double valor1,double valor2, double valor3) {
		this.resultadoDouble = (valor1+valor2+valor3)/ 3;
		return this.resultadoDouble;		
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	
	public double calcularDescuento(double precio, double descuento) {		
		this.resultadoDouble = precio - (precio * (descuento/100));		
		return this.resultadoDouble;
	}

}
