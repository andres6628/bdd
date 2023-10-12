package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.krakedev.test.TestBuscarPorCedula;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	
	public Directorio() {
		this.contactos = new ArrayList<Contacto>();
		this.correctos = new ArrayList<Contacto>();
		this.incorrectos = new ArrayList<Contacto>();
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public boolean agregarContacto(Contacto c) {
		Contacto contacto = buscarPorCedula(c.getCedula()); 
		if(contacto == null) {
			this.contactos.add(c);
			//this.fechaModificacion = consultarUltimaModificacion();
			return true;
		}else {
			return false;
		}
	}
	public Contacto buscarPorCedula(String cedula) {
		for (Contacto contacto : this.contactos) {
			if(contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null;
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		Date fecha = new Date();
		String fechaFormato = sdf.format(fecha);
		return fechaFormato;		
	}
	public int contarPerdidos() {
		int perdidos = 0;
		for (Contacto contacto : contactos) {
			if(contacto.getDireccion() == null) {
				perdidos ++;
			}
		}
		return perdidos;
	}
	public int contarFijos() {
		int fijos = 0;
		for (Contacto contacto : contactos) {
			if(contacto.getDireccion() != null) {
				fijos ++;
			}
		}
		return fijos;
	}
	public void depurar() {
		for (Contacto contacto : this.contactos) {
			if(contacto.getDireccion() != null) {
				this.correctos.add(contacto);
			}else {
				this.incorrectos.add(contacto);
			}
		}
		this.contactos = new ArrayList<Contacto>();
	}
}
