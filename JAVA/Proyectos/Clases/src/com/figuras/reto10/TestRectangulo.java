package com.figuras.reto10;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int area1;
		int area2;
		double perimetro1;
		double perimetro2;
		
		
		r1.setAltura(5);
		r1.setBase(10);
		
		r2.setAltura(3);
		r2.setBase(8);
		
		area1 = r1.calcularArea();
		area2 = r2.calcularArea();
		
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		
		System.out.println("Rectángulo 1 --> Area: "+area1+" Perímetro: "+ perimetro1);
		System.out.println("Rectángulo 2 --> Area: "+area2+" Perímetro: "+ perimetro2);
		
		
	}

}
