package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPersonas {
	public static void main(String[] args) {
		AdminPersonas ap = new AdminPersonas();
		
		ArrayList<Persona> p;
		try {
			p = ap.buscarPorCedulas("00");
			if (p != null)
				System.out.println(p);
			else
				System.out.println("Datos no encontrados");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
	
			
		
	}
}
