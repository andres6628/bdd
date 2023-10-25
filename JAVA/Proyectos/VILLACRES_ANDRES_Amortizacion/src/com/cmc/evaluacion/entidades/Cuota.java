package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Redondear;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void mostrarPrestamo() {		
		System.out.println(Redondear.redondear(this.numero) + " | "+ Redondear.redondear(this.cuota) +" | " + Redondear.redondear(this.inicio) +" | "+Redondear.redondear(this.interes) +" | " +Redondear.redondear(this.abonoCapital)+" | " +Redondear.redondear(this.saldo));
	}
	
	
}
