package com.figuras.reto10;

public class Cuadrado {

	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}



	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		
		double area = lado*lado;
		return area;
	}
	public double calcularPerimtetro() {
		double perimetro = lado *4;
		return perimetro;
	}
}
