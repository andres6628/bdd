package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.*;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstadoCivil ec = new EstadoCivil("U", "UNION LIBRE");
		
		Persona p = new Persona("7777777777","FERNANDO","FLORES",ec);
		p.setEstaura(1.5);
		try {
			Date fn = Convertidor.convertirFecha("2023-10-25");
			Date hn = Convertidor.convertirHora("8:50");
			p.setFecha_nacimiento(fn);
			p.setHora_nacimiento(hn);
			p.setCantidad_Ahorrada( new BigDecimal(255.50));
			p.setNumero_hijos(2);
			AdminPersonas ap = new AdminPersonas();
			ap.insertar(p);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
		}
		
	}

}
