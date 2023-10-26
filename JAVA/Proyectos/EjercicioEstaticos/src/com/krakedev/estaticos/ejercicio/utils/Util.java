package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int i) {
		
		if(i<10) {
			return  "0" +i;
		}else{
			return ""+i;
		}

	}
	public static String formatearDia(int i) {
		if(i == 0)
			return "LUNES";
		if(i == 1)
			return "MARTES";
		if(i == 2)
			return "MIERCOLES";
		if(i == 3)
			return "JUEVES";
		if(i == 4)
			return "VIERNES";
		if(i == 5)
			return "SABADO";
		if(i == 6)
			return "DOMINGO";
		
		return "";
	}
}
