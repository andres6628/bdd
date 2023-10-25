package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private String cedula;
	private double monto;
	private double interes;
	private int plazo;
	ArrayList<Cuota> cuotas ;
	
	public Prestamo(double monto, double interes, int plazo) {
		this.cuotas = new ArrayList<Cuota>(plazo-1);
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}
	
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	public void mostrarPrestamo() {
		System.out.println("[ monto= "+ this.monto +" interes= "+ this.interes +" plazo = "+this.plazo +"]");
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCedula() {
		return cedula;
	}
	
	
}
