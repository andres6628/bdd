package krake.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public String buscarEstudiantePorCedula(Estudiante estudiante){
		for (Estudiante est : this.estudiantes) {
			if(estudiante.getCedula() == est.getCedula()) {
				return "encontrado";
			}
		}
		return null;
	}
	public void matricularEstudiantes(Estudiante estudiante) {
		if(buscarEstudiantePorCedula(estudiante) ==null) {
			this.estudiantes.add(estudiante);
		}
	}
	public double calcularPromedioCurso() {
		float sumaNotas = 0;
		for (Estudiante estudiante : this.estudiantes) {
			sumaNotas = sumaNotas + (float)estudiante.calcularPromedioNotasEstudiante();
		}
		return sumaNotas/this.estudiantes.size();
	}
	public void mostrar() {
		String mensaje = " ";
		for (Estudiante estudiante : this.estudiantes) {		
			mensaje = mensaje +  estudiante.getNombre() + " " + estudiante.getApellido()+" Promedio: "+ estudiante.calcularPromedioNotasEstudiante();
			ArrayList<Nota> notas = estudiante.getNotas(); 
				for (Nota nota : notas) {
					nota.mostrar();
				}
		}
		System.out.println(mensaje);
	}
}
