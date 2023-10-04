package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telef = new Telefono("Movi","0231654789",25);
		Contacto c = new Contacto("Perez", telef, 5.4);
		
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + c.getTelefono().getOperadora());
		System.out.println("Número: " + c.getTelefono().getNumero());
		System.out.println("Peso: " + c.getPeso());
	}

}
