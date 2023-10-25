package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interes = prestamo.getInteres()/12/100;
		double cuota = (prestamo.getMonto()* interes)/(1-( Math.pow((1+interes),-prestamo.getPlazo()) )); 
		return cuota;
	}
	public static void generarTabla(Prestamo prestamo) {
		double cuota = calcularCuota(prestamo);
		//double capital;
		double inicio  = prestamo.getMonto();
		double interes = inicio * (prestamo.getInteres()/12/100);
		double abonoCapital = cuota - interes;
		double saldo = inicio - abonoCapital ;
		
		Cuota c = new Cuota(1);
		c.setInicio(inicio);
		c.setCuota(cuota);
		c.setAbonoCapital(abonoCapital);
		c.setSaldo(saldo);
		c.setInteres(interes);
		prestamo.getCuotas().add(c);

		for(int i = 1; i< prestamo.getPlazo(); i++) {
			 inicio = prestamo.getCuotas().get(i-1).getSaldo();
			 interes = inicio * (prestamo.getInteres()/12/100);
			 abonoCapital = cuota - interes;
			 saldo = inicio - abonoCapital;
			 c = new Cuota(i+1);
			 c.setInicio(inicio);
			 c.setCuota(cuota);
			 c.setAbonoCapital(abonoCapital);
			 c.setInteres(interes);
			 c.setSaldo(saldo);
			 prestamo.getCuotas().add(c);
		}
	}
	/*public static void calcularValoresCuota(double interes,double cuota,double siguienteCuota) {
		
	}*/
	public static void mostrarTabla(Prestamo prestamo) {
		for(int i = 0; i < prestamo.getPlazo() ; i++) {
			prestamo.getCuotas().get(i).mostrarPrestamo();
		}
		
	}
}
