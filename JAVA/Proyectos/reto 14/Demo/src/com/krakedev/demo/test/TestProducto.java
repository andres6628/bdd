package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(1,"Teléfono");
		
		p1.setDescripcion("Tipo electrónico");
		p1.setPeso(8);
		
		System.out.println("**PRODUCTO**");
		System.out.println("Código: " + p1.getCodigo());
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Descripción: " + p1.getDescripcion());
		System.out.println("Peso: " + p1.getPeso());
	}
	
	

}
