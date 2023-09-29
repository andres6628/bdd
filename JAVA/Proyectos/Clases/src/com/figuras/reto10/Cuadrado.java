package com.figuras.reto10;

public class Cuadrado {

	public double lado;
	
	public double calcularArea() {
		
		double area = lado*lado;
		return area;
	}
	public double calcularPerimtetro() {
		double perimetro = lado *4;
		return perimetro;
	}
}
