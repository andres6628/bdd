package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validador = new Validacion();
		System.out.println(validador.validarMonto(45));
		System.out.println(validador.validarMonto(0));
	}

}
