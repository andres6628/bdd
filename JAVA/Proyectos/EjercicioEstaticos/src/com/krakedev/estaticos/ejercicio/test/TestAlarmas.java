package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.entidades.*;
import com.krakedev.estaticos.ejercicio.logica.*;
import com.krakedev.estaticos.ejercicio.utils.*;
import java.util.ArrayList;


public class TestAlarmas {
	public static void main(String[] args) {
				
		Alarma a1 = new Alarma(DiasSemana.LUNES,10,5);
		Alarma a2 = new Alarma(DiasSemana.MARTES,11,15);
		Alarma a3 = new Alarma(DiasSemana.MIERCOLES,12,25);
		Alarma a4 = new Alarma(DiasSemana.JUEVES,13,35);
		Alarma a5 = new Alarma(DiasSemana.VIERNES,14,45);
		Alarma a6 = new Alarma(DiasSemana.SABADO,15,55);
		
		AdminAlarmas aa = new AdminAlarmas();
		aa.agregarAlarma(a1);
		aa.agregarAlarma(a2);
		aa.agregarAlarma(a3);
		aa.agregarAlarma(a4);
		aa.agregarAlarma(a5);
		aa.agregarAlarma(a6);
		
		ArrayList<Alarma> alarmas = aa.getAlarmas();
		
		System.out.println(alarmas);
	}
}
