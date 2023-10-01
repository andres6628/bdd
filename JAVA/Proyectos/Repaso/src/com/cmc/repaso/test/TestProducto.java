package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto("Carro",80000);
		p.setPrecio(50000);
		
		System.out.println("Producto: "+ p.getNombre() + " Precio y descuento" + p.getPrecio() + " / " + p.calcularPRecioPromo(50));
	}

}
