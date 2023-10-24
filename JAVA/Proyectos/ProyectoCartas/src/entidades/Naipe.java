package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	
	
	public Naipe() {
		this.numerosPosibles = new ArrayList<Numero>();
		this.numerosPosibles.add(new Numero("A",11));
		this.numerosPosibles.add(new Numero("2",2));
		this.numerosPosibles.add(new Numero("3",3));
		this.numerosPosibles.add(new Numero("4",4));
		this.numerosPosibles.add(new Numero("5",5));
		this.numerosPosibles.add(new Numero("6",6));
		this.numerosPosibles.add(new Numero("7",7));
		this.numerosPosibles.add(new Numero("8",8));
		this.numerosPosibles.add(new Numero("9",9));
		this.numerosPosibles.add(new Numero("10",10));
		this.numerosPosibles.add(new Numero("J",10));
		this.numerosPosibles.add(new Numero("Q",10));
		this.numerosPosibles.add(new Numero("K",10));
		
		Palos palos = new Palos();
		this.cartas = new ArrayList<Carta>();
		for (Numero numero : this.numerosPosibles) {
			this.cartas.add(new Carta(numero,palos.CORAON_NEGRO));
			this.cartas.add(new Carta(numero,palos.CORAZON_ROJO));
			this.cartas.add(new Carta(numero,palos.DIAMANTE));
			this.cartas.add(new Carta(numero,palos.TREBOL));
		}
		}



	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for(int i = 1; i <= 100; i++) {
			int numAux = Random.obtenerPosicion();
			Carta carta = this.cartas.get(numAux);
			if(carta.getEstado() == "N") {
				auxiliar.add(carta);
				this.cartas.get(numAux).setEstado("C");
			}
		}
		for (Carta carta : this.cartas) {
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		
		return auxiliar;
	}
	
	
}
