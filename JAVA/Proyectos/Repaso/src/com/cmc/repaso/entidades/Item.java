package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
		this.nombre = nombre;
		this.productosActuales = productosActuales;
		this.productosDevueltos = productosDevueltos;
		this.productosVendidos = productosVendidos;
	}

	
	public void imprimir(){
		System.out.printf("%s%s%n%s%d%n%s%d%n%s%d%n","Nombre: ", this.nombre ,  "Prod. actuales: ",this.productosActuales, "Prod. devueltos: ", this.productosDevueltos,"Prod. vendidos: ", this.productosVendidos);
	
	};
	
	public void vender(int productosVendidos) {
		this.productosActuales = this.productosActuales- productosVendidos;
		this.productosVendidos = this.productosVendidos + productosVendidos;
	}
	
	public void devolver(int productosDevueltos) {
		this.productosActuales = this.productosActuales - productosDevueltos;
		this.productosVendidos = this.productosVendidos - productosDevueltos;
		this.productosDevueltos = this.productosDevueltos + productosDevueltos;
	}
}

