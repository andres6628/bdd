package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));

		Producto producto = new Producto("KE34", "Papitas", 0.85f);
		maquina.cargarProducto(producto, "B", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 2.54f);
		maquina.cargarProducto(producto2, "D", 5);

		maquina.mostrarProductos();
	}
}
