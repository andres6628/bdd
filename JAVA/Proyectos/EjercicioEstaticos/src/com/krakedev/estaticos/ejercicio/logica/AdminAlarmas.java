package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.*;


public class AdminAlarmas {
	private ArrayList<Alarma> alarmas = new ArrayList<>();

	public void agregarAlarma(Alarma a) {
		alarmas.add(a);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
}


