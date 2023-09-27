package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Chevrolet";
		auto1.anio = 2023;
		auto1.precio = 25000;
		
		auto2.marca = "Nisan";
		auto2.anio = 2022;
		auto2.precio = 18000;
		
		System.out.println("**AUTO 1**");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		

		System.out.println("");
		
		System.out.println("**AUTO 2**");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
