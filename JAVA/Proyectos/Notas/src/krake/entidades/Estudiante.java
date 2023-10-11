package krake.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	
	
	public Estudiante(String cedula,String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	public void agregarNota(Nota nota){
		boolean repetido = false;
		if(nota.getCalificacion() > 0 && nota.getCalificacion()<=10) {
			for (Nota not : notas) {
				String codigo1 = nota.getMateria().getCodigo();
				String codigo2 = not.getMateria().getCodigo();
				if( codigo1 == codigo2) {
					repetido = true;
				}
			}
			if(repetido == false) {
				notas.add(nota);
			}
		}
	}
	public void modificarNota(String codigo, double nuevaNota) {
		for (Nota nota : this.notas) {
			if(nota.getMateria().getCodigo().equals(codigo)) {
				if(nuevaNota>0 && nuevaNota <=10) {
				nota.setCalificacion((float)nuevaNota);
				break;
				}
			}
		}
		System.out.println("No se encotró el código de la materia");
	}
	
	public double calcularPromedioNotasEstudiante() {
		float sumaNotas=0;
		for (Nota nota : this.notas) {
			sumaNotas = sumaNotas + nota.getCalificacion();
		}
		return sumaNotas/this.notas.size();
	}
	public void mostrar() {
		String mensaje = "Cédula: " + this.cedula + " Nombre: "+this.nombre + " Apellido: "+ this.apellido +" Notas: ";
		for (Nota nota : this.notas) {
			mensaje += nota.getMateria().getNombre()+": " + nota.getCalificacion()+" ";
		}
		System.out.println(mensaje); 
	}
}
