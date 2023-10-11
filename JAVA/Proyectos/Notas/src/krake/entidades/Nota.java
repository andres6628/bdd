package krake.entidades;

public class Nota {
	
	private Materia materia;
	private float calificacion;
	
	
	public Nota(Materia materia, float calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public float getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}


	public void mostrar() {
		System.out.println("Nota "+" Materia: "+this.materia+" Calificacion: "+this.calificacion);
	}
}
