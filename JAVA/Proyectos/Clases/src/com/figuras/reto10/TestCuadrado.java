package com.figuras.reto10;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado(); 
		Cuadrado c2 = new Cuadrado(); 
		Cuadrado c3 = new Cuadrado();
		
		c1.setLado(7.5);
		c2.setLado(54);
		c3.setLado(8);
		
		double areaC1 = c1.calcularArea();
		double areaC2 = c2.calcularArea();
		double areaC3 = c3.calcularArea();
		
		double perimetroC1 = c1.calcularPerimtetro();
		double perimetroC2 = c2.calcularPerimtetro();
		double perimetroC3 = c3.calcularPerimtetro();
		
		System.out.printf("%s%n%s%.2f%s%.2f%n","Cuadrado 1","Area: ",areaC1," Perímetro: ",perimetroC1);
		System.out.printf("%s%n%s%.2f%s%.2f%n","Cuadrado 2","Area: ",areaC2," Perímetro: ",perimetroC2);
		System.out.printf("%s%n%s%.2f%s%.2f%n","Cuadrado 3","Area: ",areaC3," Perímetro: ",perimetroC3);
		
	}

}
