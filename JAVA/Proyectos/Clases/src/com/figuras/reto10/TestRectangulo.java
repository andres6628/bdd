package com.figuras.reto10;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(10,5);
		Rectangulo r2 = new Rectangulo(8,3);
		int area1;
		int area2;
		double perimetro1;
		double perimetro2;
		
		area1 = r1.calcularArea();
		area2 = r2.calcularArea();
		
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		
		System.out.println("Rectángulo 1 --> Area: "+area1+" Perímetro: "+ perimetro1);
		System.out.println("Rectángulo 2 --> Area: "+area2+" Perímetro: "+ perimetro2);
		
		
	}

}
