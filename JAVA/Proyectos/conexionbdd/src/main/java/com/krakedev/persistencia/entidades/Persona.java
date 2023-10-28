package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private double estaura;
	private Date fecha_nacimiento;
	private Date hora_nacimiento;
	private BigDecimal cantidad_Ahorrada;
	private int numero_hijos;
	private EstadoCivil estado_civil;
	
	public Persona() {
		super();
	}
	
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estado_civil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado_civil = estado_civil;
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
	public double getEstaura() {
		return estaura;
	}
	public void setEstaura(double estaura) {
		this.estaura = estaura;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getHora_nacimiento() {
		return hora_nacimiento;
	}
	public void setHora_nacimiento(Date hora_nacimiento) {
		this.hora_nacimiento = hora_nacimiento;
	}
	public BigDecimal getCantidad_Ahorrada() {
		return cantidad_Ahorrada;
	}
	public void setCantidad_Ahorrada(BigDecimal d) {
		this.cantidad_Ahorrada = d;
	}
	public int getNumero_hijos() {
		return numero_hijos;
	}
	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}
	public EstadoCivil getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(EstadoCivil estado_civil) {
		this.estado_civil = estado_civil;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estaura=" + estaura
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", hora_nacimiento=" + hora_nacimiento
				+ ", cantidad_Ahorrada=" + cantidad_Ahorrada + ", numero_hijos=" + numero_hijos + ", estado_civil="
				+ estado_civil + "]";
	}
	
	
	
	
}
