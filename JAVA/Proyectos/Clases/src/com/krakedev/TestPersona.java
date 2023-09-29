package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());
		
		//modificar
		p.setNombre("Javier");
		p.setEdad(25);
		p.setEstatura((float)1.60);
		
		//datos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());
	}

}
