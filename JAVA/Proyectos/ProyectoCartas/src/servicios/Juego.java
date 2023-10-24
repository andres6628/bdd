package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.ToIntFunction;

import entidades.*;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	
	
	public Juego() {
		this.naipeBarajado = this.naipe.barajar();
	}

	public Juego( ArrayList<String> idsJugador) {
		this.naipe = new Naipe();
		this.cartasJugador = new ArrayList<ArrayList<Carta>>();
		for (String id : idsJugador) {
			ArrayList<Carta> cartas = new ArrayList<Carta>();
			this.cartasJugador.add( Integer.valueOf(id) , cartas);
		}
		
		this.naipeBarajado = this.naipe.barajar();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void setCartasJugador(ArrayList<ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}
	
	public void entregarCartas(int cartasPorJugador) {
		
		for(int j = 0 ; j< cartasPorJugador; j++) {
			for(int i = 0 ; i < this.cartasJugador.size() ; i++) {
				this.cartasJugador.get(i).add(this.naipeBarajado.getFirst());
				this.naipeBarajado.removeFirst();
			}
		}
	}
	public int devolverTotal(int id) {
		ArrayList<Carta> lista = this.cartasJugador.get(id);
		int suma = 0;
		for (Carta carta : lista) {
			suma = suma + carta.getNumero().getValor();
		}
		return suma;
	}
	
	public int determinarGanador(){
		int idGanador = 0;
		int sumaGanador = devolverTotal(idGanador);
		for(int i = 1; i<this.cartasJugador.size(); i++) {
			int suma = devolverTotal(i);
			if(suma>sumaGanador) {
				idGanador = i;
				sumaGanador = suma;
			}
		}
		return idGanador;
	}
	
	
}
