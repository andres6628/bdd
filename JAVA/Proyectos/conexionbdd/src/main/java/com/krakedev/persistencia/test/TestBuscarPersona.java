package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPersona {
	public static void main(String[] args) {
		AdminPersonas ap = new AdminPersonas();
		
		Persona p;
		try {
			p = ap.buscarPorCedula("n");
			if (p != null) 
				System.out.println(p);
			else
				System.out.println("Dato no encontrado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: "+ e.getMessage());
		}
		
		
	}
}
