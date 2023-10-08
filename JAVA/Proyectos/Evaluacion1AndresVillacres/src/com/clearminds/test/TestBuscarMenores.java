package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("A3"));
		maquina.agregarCelda(new Celda("A4"));
		maquina.agregarCelda(new Celda("A5"));
		maquina.agregarCelda(new Celda("A6"));

		Producto producto1 = new Producto("KE34", "Papitas", 0.85f);
		Producto producto2 = new Producto("KE35", "Pizza", 10f);
		Producto producto3 = new Producto("KE36", "Chitos", 5f);
		Producto producto4 = new Producto("KE37", "Doritos", 0.5f);
		Producto producto5 = new Producto("KE38", "Jet", 0.25f);
		Producto producto6 = new Producto("KE39", "DeTodito", 0.6f);

		maquina.cargarProducto(producto1, "A1", 4);
		maquina.cargarProducto(producto2, "A2", 5);
		maquina.cargarProducto(producto3, "A3", 6);
		maquina.cargarProducto(producto4, "A4", 7);
		maquina.cargarProducto(producto5, "A5", 8);
		maquina.cargarProducto(producto6, "A6", 9);

		float limite=4;
		ArrayList<Producto> p = maquina.buscarMenores(limite);
		System.out.println("Productos Menores:"+limite);
		for (Producto producto : p) {
			System.out.println("Nombre:"+producto.getNombre()+" Precio:"+producto.getPrecio());
		}
		
	}

}
