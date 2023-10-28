package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Habitacion;
import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminEjercicio3;
import com.krakedev.persistencia.utils.Convertidor;

public class TestEjercicio3Editar {
	public static void main(String[] args) {
		Habitacion h = new Habitacion(16, new BigDecimal(3000.50), 2, 5);
		Proyecto p = new Proyecto(5, "Escuela de basket", new BigDecimal(2500));
		AdminEjercicio3 a = new AdminEjercicio3();

		try {
			Date fi = Convertidor.convertirFecha("2023-05-15");
			Date ff = Convertidor.convertirFecha("2023-10-20");

			p.setFecha_inicio(fi);
			p.setFecha_fin(ff);

			 a.editarProyecto(p);

			a.editarHabitacion(h);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}

	}

}
