package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t1 = new Telefono("Movi","0231654789",25);
		Telefono t2 = new Telefono("Claro","0931654789",30);
		Telefono t3 = new Telefono("Claro","0789165478",25);
		Telefono t4 = new Telefono("Claro","0789165478",25);
		
		AdminTelefono at = new AdminTelefono();
		int operadorasClaro = at.contarClaro(t1, t2, t3, t4);
		System.out.println(operadorasClaro);
		 
		
		
	}

}
