package test;

import entidades.Random;

public class TestRandom {
	public static void main(String[] args) {
	Random r = new Random();
	int numero = r.obtenerPosicion();
	if (numero >1) {
		System.out.println(r.obtenerPosicion());
		System.out.println("El método obtenerPosicioin no ha arrojado 0 o 1.");
	}else 
		System.out.println(r.obtenerPosicion());
	}
}
