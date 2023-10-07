package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double saldo;
	
	
	public MaquinaDulces() {
		this.saldo = 0;
	}
	
	public void configurarMaquina(String c1, String c2, String c3, String c4){
		this.Celda1 = new Celda(c1);
		this.Celda2 = new Celda(c2);
		this.Celda3 = new Celda(c3);
		this.Celda4 = new Celda(c4);
	}
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + this.Celda1.getCodigo());
		System.out.println("CELDA 2: " + this.Celda2.getCodigo());
		System.out.println("CELDA 3: " + this.Celda3.getCodigo());
		System.out.println("CELDA 4: " + this.Celda4.getCodigo());
		System.out.println("SALDO: "+this.saldo);

	}
	
	public Celda buscarCelda(String codigo) {
		if(this.Celda1.getCodigo().equals(codigo)) {
			return this.Celda1;
		}
		if(this.Celda2.getCodigo().equals(codigo)) {
			return this.Celda2;
		}
		if(this.Celda3.getCodigo().equals(codigo)) {
			return this.Celda3;
		}
		if(this.Celda4.getCodigo().equals(codigo)) {
			return this.Celda4;
		}
		return null;
	}
	
	public void cargarProducto(Producto producto,String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.setProducto(producto);
		celdaRecuperada.setStock(items);
	}
	void mostrarProducto(Celda celda) {
		if(celda.getProducto()!=null) {
			System.out.println(" Nombre: " + celda.getProducto().getNombre());
			System.out.println(" Precio: "+ celda.getProducto().getPrecio());
			System.out.println(" Código: "+ celda.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
	}
	public void mostrarProductos() {
		System.out.println("***CELDA "+this.Celda1.getCodigo());
		System.out.println(" Stock: " + this.Celda1.getStock()); 
		mostrarProducto(Celda1);
		
		System.out.println("***CELDA "+this.Celda2.getCodigo());
		System.out.println(" Stock: " + this.Celda2.getStock()); 
		mostrarProducto(Celda2);
		
		System.out.println("***CELDA "+this.Celda3.getCodigo());
		System.out.println(" Stock: " + this.Celda3.getStock()); 
		mostrarProducto(Celda3);
		
		System.out.println("***CELDA "+this.Celda4.getCodigo());
		System.out.println(" Stock: " + this.Celda4.getStock()); 
		mostrarProducto(Celda4);
		
		System.out.println("SALDO: "+this.saldo);

		}
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda = buscarCelda(codigo);
		if(celda != null)
			return celda.getProducto();
		else
			return null;
	}
	public double consultarPrecio(String codigo) {
		Celda celda = buscarCelda(codigo);
		return celda.getProducto().getPrecio();
	}
	public Celda buscarCeldaProducto(String codigo) {
		
		if(this.Celda1.getProducto() != null){
			String codigoC1 = this.Celda1.getProducto().getCodigo();
			if(codigoC1 == codigo){
				return this.Celda1;
			}
		}
		if(this.Celda2.getProducto() != null){
			String codigoC2 = this.Celda2.getProducto().getCodigo();
			if(codigoC2 == codigo){
				return this.Celda2;
			}
		}
		if(this.Celda3.getProducto() != null){
			String codigoC3 = this.Celda3.getProducto().getCodigo();
			if(codigoC3 == codigo){
				return this.Celda3;
			}
		}
		if(this.Celda4.getProducto() != null){
			String codigoC4 = this.Celda4.getProducto().getCodigo();
			if(codigoC4 == codigo){
				return this.Celda4;
			}
		}
		return null;
	}
	public void incrementarProductos(String codigo,int items ) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		if(celdaEncontrada != null) {
			int itemsCelda = celdaEncontrada.getStock() + items;
			celdaEncontrada.setStock(itemsCelda);
		}
	}
	public void vender(String codigo) {
		Celda celda = buscarCelda(codigo);
		int stock = celda.getStock()-1;
		celda.setStock(stock);
		double precio = celda.getProducto().getPrecio();
		this.saldo = saldo + precio; 
		mostrarProductos();
	}
	public double venderConCambio(String codigo, double valor) {
		Celda celda = buscarCelda(codigo);
		int stock = celda.getStock()-1;
		celda.setStock(stock);
		double precio = celda.getProducto().getPrecio();
		this.saldo = saldo + precio;
		return (valor - precio);
	}
}
