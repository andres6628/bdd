package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t1 = new Telefono("Claro","0223654777",1);
		Telefono t2 = new Telefono("Movi","01111111111",100);

		Contacto c1 = new Contacto("Jerez", t1, 700);
		Contacto c2 = new Contacto("Solis", t2, 1);
		
		AdminContactos ca = new AdminContactos();
		Contacto masPesado = ca.buscarMasPesado(c1, c2);
		
		System.out.println("Contacto más pesado: " + masPesado.getApellido());
		System.out.println(ca.compararOperadoras(c1, c2));
	
	}

}
