package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.*;
import com.krakedev.persistencia.servicios.AdminEjercicio3;
import com.krakedev.persistencia.utils.Convertidor;

public class TestEjercicio3 {
	public static void main(String[] args) {
		Habitacion h = new Habitacion(16, new BigDecimal(2500.50), 5, 25);
		Proyecto p = new Proyecto(5, "Escuela de futbol", new BigDecimal(2500));
		AdminEjercicio3 a = new AdminEjercicio3();
		
		try {
			Date fi = Convertidor.convertirFecha("2023-05-01");
			Date ff = Convertidor.convertirFecha("2023-10-27");

			p.setFecha_inicio(fi);
			p.setFecha_fin(ff);
			
			a.insertarProyecto(p);
			
			a.insertarHabitacion(h);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}

	}

}
