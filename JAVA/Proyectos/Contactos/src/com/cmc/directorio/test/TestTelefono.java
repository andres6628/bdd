package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t1 = new Telefono("Movi","09941234123",10);
		
		System.out.println("Operadora: "+ t1.getOperadora() + " Número: "+ t1.getNumero()+" Código: "+t1.getCodigo()+" Whatsapp?: "+ t1.isTieneWhatsapp());
	}

}
