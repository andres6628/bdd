package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private float precio;
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
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
		if(precio >=0) {
			this.precio = precio;
		}else {
			this.precio = precio * -1;
		}
	}
	public float calcularPRecioPromo(float porcentaje){
		float descuento= this.precio - (this.precio*porcentaje/100);
		return descuento;
	}
	
	
	
}
