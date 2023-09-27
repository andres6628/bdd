package com.krakedev;

public class Calculadora {
	public double multiplicar(double valor1, double valor2) {
		return valor1*valor2;
	}
	
	public double dividir(double dividendo, double divisor) {
		return dividendo/divisor;
	}
	public double promediar(double valor1, double valor2, double valor3) {
		double promedio;
		promedio = (valor1+valor2+valor3)/3;
		return promedio;
	}
	
	void mostrarResultado(){
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
