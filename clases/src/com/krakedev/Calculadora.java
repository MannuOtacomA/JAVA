package com.krakedev;

public class Calculadora {
    private double valor1;
    private double valor2;
    private double valor3;
    private double resultadoDouble;
    private int resultadoInt;

    // Constructor con los datos que usa todas las operaciones
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Constructor para operaciones que necesitan 3 valores (como promediar)
    public Calculadora(double valor1, double valor2, double valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    // Getters y Setters
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

    //---funciones, sin parametros, usan los valores del constructor
    public double sumar() {
        this.resultadoDouble = this.valor1 + this.valor2;
        return this.resultadoDouble;
    }

    public int restar() {
        this.resultadoInt = (int)(this.valor1 - this.valor2);
        return this.resultadoInt;
    }

    public double multiplicar() {
        this.resultadoDouble = this.valor1 * this.valor2;
        return this.resultadoDouble;
    }

    public double dividir() {
        this.resultadoDouble = this.valor1 / this.valor2;
        return this.resultadoDouble;
    }

    public double promediar() {
        this.resultadoDouble = (this.valor1 + this.valor2 + this.valor3) / 3;
        return this.resultadoDouble;
    }

    public void mostrarResultado() {
        System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
    }

    public double calcularDescuento() {
        // valor1 = precio, valor2 = descuento
        this.resultadoDouble = this.valor1 - (this.valor1 * (this.valor2 / 100));
        return this.resultadoDouble;
    }
}