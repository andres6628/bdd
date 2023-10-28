package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;

public class Habitacion {
	private int habitacion_numero;
	private BigDecimal precioNoche;
	private int piso;
	private int max_personas;
	
	
	
	public Habitacion(int habitacion_numero, BigDecimal bigDecimal, int piso, int max_personas) {
		this.habitacion_numero = habitacion_numero;
		this.precioNoche = bigDecimal;
		this.piso = piso;
		this.max_personas = max_personas;
	}

	public int getHabitacion_numero() {
		return habitacion_numero;
	}
	public void setHabitacion_numero(int habitacion_numero) {
		this.habitacion_numero = habitacion_numero;
	}
	public BigDecimal getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(BigDecimal precioNoche) {
		this.precioNoche = precioNoche;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getMax_personas() {
		return max_personas;
	}
	public void setMax_personas(int max_personas) {
		this.max_personas = max_personas;
	}
	@Override
	public String toString() {
		return "Habitacion [habitacion_numero=" + habitacion_numero + ", precioNoche=" + precioNoche + ", piso=" + piso
				+ ", max_personas=" + max_personas + "]";
	}
	
	
}
