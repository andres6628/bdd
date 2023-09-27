package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "telefono";
		productoA.descripcion = "articulo electronico";
		productoA.precio = 450;
		productoA.stockActual = 100;
		
		productoB.nombre = "smarth tv";
		productoB.descripcion = "electrodomestico";
		productoA.precio = 250;
		productoB.stockActual = 10;
		
		productoC.nombre = "laptop";
		productoC.descripcion = "articulo electronico";
		productoA.precio = 300;
		productoC.stockActual = 25;
		
		System.out.println("**PRODUCTO A**");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripción: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock: "+productoA.stockActual );
		System.out.println("");
		

		System.out.println("**PRODUCTO B**");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripción: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock: "+productoB.stockActual );
		System.out.println("");


		System.out.println("**PRODUCTO C**");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripción: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock: "+productoC.stockActual );
		System.out.println("");
	}

}
