package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t1 = new Telefono("Movi","0231654789",25);
		Contacto c1 = new Contacto("Perez", t1, 5.4);
		
		System.out.println("Contacto:" + c1.getApellido());
		System.out.println("Activo?: " + c1.isActivo());
		System.out.println("Whatsapp?: " + c1.getTelefono().isTieneWhatsapp());
		
		AdminContactos ac = new AdminContactos();
		t1.setTieneWhatsapp(true);
		
		ac.activarUsuario(c1);
		System.out.println("Contacto: " + c1.getApellido());
		System.out.println("Activo?: " + c1.isActivo());
		System.out.println("Whatsapp?: " + c1.getTelefono().isTieneWhatsapp());
		
	}

}
