package test;

import java.util.ArrayList;

import servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ids = new ArrayList<>();
		ids.add("0");
		ids.add("1");
		ids.add("2");
		Juego j = new Juego(ids);
		j.entregarCartas(5);
		System.out.println("Total de jugador 0: "+ j.devolverTotal(0));
		System.out.println("Total de jugador 1: "+ j.devolverTotal(1));
		System.out.println("Total de jugador 2: "+ j.devolverTotal(2));
		System.out.println("El ganador es: jugador "+ j.determinarGanador());
		
	}

}
