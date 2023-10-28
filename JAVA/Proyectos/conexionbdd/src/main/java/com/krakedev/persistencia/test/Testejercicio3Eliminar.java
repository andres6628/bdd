package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminEjercicio3;

public class Testejercicio3Eliminar {
	public static void main(String[] args) {
		AdminEjercicio3 a = new AdminEjercicio3();
		try {
			a.eliminarHabitacion(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Algo salio mal");
		}
		try {
			a.eliminarProyecto(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Algo salio mal");
		}
	}
}
