package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {

		Auto auto1 = new Auto("Chevrolet",2023,25000);
		Auto auto2 = new Auto("Nisan",2022,18000);
		
		
		
		System.out.println("**AUTO 1**");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		

		System.out.println("");
		
		System.out.println("**AUTO 2**");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
