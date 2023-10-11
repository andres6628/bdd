package krake.test;

import krake.entidades.*;

public class CursoTest {

	public static void main(String[] args) {
		     Curso curso1 = new Curso();
			 Materia sociales= new Materia("COD1", "Sociales");
			 Materia matematicas= new Materia("COD2", "Matematicas");
			 Materia lenguaje= new Materia("COD3", "Lenguaje");

			 Estudiante estudiante = new Estudiante("1234567890", "Juan", "Perez");
			 Estudiante estudiante2 = new Estudiante("12345678290", "Juan", "Perez");
		     Nota nota1 = new Nota(sociales, 10.0f);
		     Nota nota2 = new Nota(matematicas, 10.0f);
		     Nota nota3 = new Nota(lenguaje, 10.0f);
		     
		     
		     Nota nota11 = new Nota(sociales,5.0f);
		     Nota nota12 = new Nota(matematicas, 5.0f);
		     Nota nota13 = new Nota(lenguaje, 10.0f);
		     
		     //Agrega 3 nuevas calificaciones  a Estudiante 1
		     estudiante.agregarNota(nota1);
		     estudiante.agregarNota(nota2);
		     estudiante.agregarNota(nota3);

		     
		     //Agrega 3 nuevas calificaciones  a Estudiante 2
		     estudiante2.agregarNota(nota11);
		     estudiante2.agregarNota(nota12);
		     estudiante2.agregarNota(nota13);
	
		     
		     
		     
		     
		     
		     curso1.matricularEstudiantes(estudiante);
		     curso1.matricularEstudiantes(estudiante2);
		     
		     System.out.println(curso1.getEstudiantes().size());
		     
		     System.out.println(curso1.calcularPromedioCurso());

		     
		     curso1.mostrar();
	}

}
