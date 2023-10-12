package com.krakedev.evaluacion;

public class Telefono {
private String numero;
private String tipo;
private String estado;

public String getNúmero() {
	return numero;
}

public String getTipo() {
	return tipo;
}

public String getEstado() {
	return estado;
}

public Telefono(String numero, String tipo) {
	this.numero = numero;
	this.tipo = tipo;
	this.asignarEstado();
}
public void asignarEstado() {
	if(this.numero == null) {
		this.estado = "E";
	}else {
		if(validarTipo()) {
			this.estado = "C";
		}else {
			this.estado = "E";
		}
	}
}
public boolean validarTipo() {
	if(this.tipo != null) {
		if((this.tipo.equals("Movil") && this.numero.length() == 10) || (this.tipo.equals("Convencional") && this.numero.length() == 7)) {
			return true;
		}
	}
	return false;
}



}
