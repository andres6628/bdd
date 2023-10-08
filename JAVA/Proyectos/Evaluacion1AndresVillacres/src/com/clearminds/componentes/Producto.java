package com.clearminds.componentes;

public class Producto {

	private String nombre;
	private float precio;
	private String codigo;
	
	public Producto(String codigo,String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void incrementarPrecio(int porcentaje) {
		this.precio = this.precio + (this.precio*porcentaje/100);
	}
	 public void disminuirPrecio(double descuento) {
		 this.precio = this.precio - (float)descuento;				 
	 }
}
