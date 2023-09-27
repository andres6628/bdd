package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);
		
		//modificar
		p.nombre = "Javier";
		p.edad = 25;
		p.estatura = (float) 1.60;
		
		//datos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);
	}

}
