package com.clearminds.maquina;
import java.util.ArrayList;

import com.clearminds.componentes.*;


public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		this.celdas = new ArrayList<Celda>();
		this.saldo = 0;
	}
	
	public void agregarCelda(Celda celda) {
		//Celda celda = new Celda(codigo);
		this.celdas.add(celda);
	}
	public void mostrarConfiguracion() {
		for (Celda celda : celdas) {
			System.out.println("Celda:" + celda.getCodigo());
		}
	}
	public Celda buscarCelda(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigo)) {
				return celda;
			}
		}
		return null;
	}
	public void cargarProducto(Producto producto,String codigo,int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, items);
		}
	}
	public void mostrarProductos() {
		for (Celda celda : celdas) {
			if(celda.getProducto()!=null) {
				System.out.println("Celda:"+celda.getCodigo()+" Stock:"+celda.getStock() + " Producto:"+ celda.getProducto().getCodigo() + " Precio:"+ celda.getProducto().getPrecio());
			}else {
				System.out.println("Celda:"+celda.getCodigo()+" Stock:0"+ " Sin producto asignado");				
			}
		}
		System.out.println("Saldo:" + this.saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto();
		}
		return null;
	}
	public float consultarPrecio(String codigo) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto().getPrecio();
		}
		return 0.0f;
	}
	public Celda buscarCeldaProducto(String codigo) {
		for (Celda celda : celdas) {
			if(celda.getProducto()!=null && celda.getProducto().getCodigo().equals(codigo)) {
				return celda;
			}
		}
		return null;
	}
	public void incrementarProductos(String codigo,int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		if (celdaEncontrada!= null) {
			int itemsA = celdaEncontrada.getStock();
			celdaEncontrada.setStock(itemsA+items);
		}
	}
	public void vender(String codigo) {
		Celda celda = buscarCelda(codigo);
		celda.setStock(celda.getStock() -1);
		float precio = celda.getProducto().getPrecio();
		this.saldo = this.saldo + precio;
	} 
	public float venderConCambio(String codigo, float valorIngresado) {
		Celda celda = buscarCelda(codigo);
		celda.setStock(celda.getStock() -1);
		float precio = celda.getProducto().getPrecio();
		this.saldo = this.saldo + precio;
		return valorIngresado-precio;
	}
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productos = new ArrayList<Producto>(); 
		for (Celda celda : this.celdas) {
			if(celda.getProducto()!=null && celda.getProducto().getPrecio()<=limite) {
				productos.add(celda.getProducto());
			}
		}
		return productos;
	}
}
