package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.*;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	
	public Banco() {
		this.prestamos = new ArrayList<Prestamo>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : clientes) {
			if(cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}
	public void registrarCliente(Cliente c) {
		if(buscarCliente(c.getCedula()) == null) {
			clientes.add(c);
			System.out.print("Cliente registrado: " + c.getNombre()+ " " + c.getApellido());
		}else {
			System.out.println("El cliente ya existe: " + c.getCedula());
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		if(buscarCliente(cedula) == null) {
			System.out.println("No es cliente del banco");
		}else {
			prestamo.setCedula(cedula);
			prestamos.add(prestamo);
			CalculadoraAmortizacion.generarTabla(prestamo);
		}
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamo = new ArrayList<Prestamo>();
		for (Prestamo p : prestamos) {
			if(p.getCedula() == cedula) {
				prestamo.add(p);
			}
		}
		return prestamo; 
	}
}
