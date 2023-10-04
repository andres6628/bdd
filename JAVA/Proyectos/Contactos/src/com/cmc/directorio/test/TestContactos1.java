package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono t1 = new Telefono("Movi","0231654789",25);
		Telefono t2 = new Telefono("Claro","0981654789",29);

		Contacto c1 = new Contacto("Perez", t1, 5.4);
		Contacto c2 = new Contacto("Villacres", t2, 7);
		
		AdminContactos ca = new AdminContactos();
		Contacto masPesado = ca.buscarMasPesado(c1, c2);
		
		System.out.println("Contacto más pesado: " + masPesado.getApellido());
		System.out.println(ca.compararOperadoras(c1, c2));
	}

}
