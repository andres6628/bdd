package com.cmc.evaluacion.servicios;

import java.text.DecimalFormat;

public class Redondear {
	public static String redondear(double numero) {
		DecimalFormat formato = new DecimalFormat("#.##");
		return formato.format(numero);
	}
    //String numeroRedondeado = formato.format(numero);
}
