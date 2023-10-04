package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora().equals("Movi")) {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono t1,Telefono t2, Telefono t3){
		int contador = 0;
		if(t1.getOperadora().equals("Movi")) {
			contador ++;
		}
		if(t2.getOperadora().equals("Movi")) {
			contador ++;
		}
		if(t3.getOperadora().equals("Movi")) {
			contador ++;
		}
		return contador;
	}
	public int contarClaro(Telefono t1,Telefono t2, Telefono t3, Telefono t4) {
		int contador =0;
		if(t1.getOperadora().equals("Movi")) {
			contador ++;
		}
		if(t2.getOperadora().equals("Movi")) {
			contador ++;
		}
		if(t3.getOperadora().equals("Movi")) {
			contador ++;
		}
		if(t4.getOperadora().equals("Movi")) {
			contador ++;
		}
		return contador;
	}
}
