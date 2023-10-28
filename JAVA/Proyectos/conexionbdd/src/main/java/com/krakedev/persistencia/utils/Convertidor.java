package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy-MM-dd";
	private static final String FORMATO_HORA = "hh:mm";

	public static Date convertirFecha(String fecha) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date f = null;
		try {
			f = sdf.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return f;

	}
	public static Date convertirHora(String hora) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date f = null;
		try {
			f = sdf.parse(hora);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return f;

	}
}
