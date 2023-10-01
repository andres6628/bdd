package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est = new Estudiante("Pedro");
		est.calificar(10);
		
		System.out.println("Estudiante: " + est.getNombre() + " Nota: "+est.getNota()+ " Resultado: " +est.getResultado());
		
	}

}
