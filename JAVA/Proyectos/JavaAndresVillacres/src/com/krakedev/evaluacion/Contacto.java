package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	
	
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public void imprimir() {
		System.out.printf("%s%s%n%s%s%n%s%s%n",
				"Cédula: ",this.cedula,
				"Nombre: ", this.nombre,
				"Apellido",this.apellido);
		System.out.printf("%s%n%s%s%n%s%s%n",
				"Dirección: ",
				"	Calle Principal: " ,this.direccion.getCallePrincipal(),
				"	Calle Secundaria: ", this.direccion.getCalleSecundaria());
	}
	
	/*public void imprimir() {
		System.out.printf("%s%s%s%s%s%n%s%s%s%s",
				"***",this.nombre," ",this.apellido,"****",
				"Dirección: ", this.direccion.getCallePrincipal(),
				" y ", this.direccion.getCalleSecundaria());
		}*/
	public void agregarTelefono(Telefono t) {
		this.telefonos.add(t);
	}
	public void mostrarTelefonos(){
		System.out.println("Teléfonos con estado 'C': ");
		for (Telefono telefono : this.telefonos) {
			if(telefono.getEstado().equals("C")) {
				System.out.println("Número: " + telefono.getNúmero() + ", Tipo: "+ telefono.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> t = new ArrayList<Telefono>();
		for (Telefono telefono : this.telefonos) {
			if(telefono.getEstado().equals("E"))
				t.add(telefono);
		}
		return t;
	}
}
