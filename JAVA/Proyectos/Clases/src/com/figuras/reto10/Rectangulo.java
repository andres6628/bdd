package com.figuras.reto10;

public class Rectangulo {

	int base;
	int altura;
	
	public int calcularArea() {
		int area = base*altura;
		return area;
	}
	public double calcularPerimetro(){
		double perimetro = (base*2)+(altura*2); 
		return perimetro;
	}
}
