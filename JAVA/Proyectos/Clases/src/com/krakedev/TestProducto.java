package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("telefono");
		productoA.setDescripcion("articulo electronico");
		productoA.setPrecio(450);
		productoA.setStockActual(100);
		
		productoB.setNombre("smarth tv");
		productoB.setDescripcion("electrodomestico");
		productoA.setPrecio(250);
		productoB.setStockActual(10);
		
		productoC.setNombre("laptop");
		productoC.setDescripcion("articulo electronico");
		productoA.setPrecio(300);
		productoC.setStockActual(25);
		
		System.out.println("**PRODUCTO A**");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: "+productoA.getStockActual());
		System.out.println("");
		

		System.out.println("**PRODUCTO B**");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: "+productoB.getStockActual());
		System.out.println("");


		System.out.println("**PRODUCTO C**");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: "+productoC.getStockActual());
		System.out.println("");
	}

}
