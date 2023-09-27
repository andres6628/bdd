package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		double multipplicacion = calculadora.multiplicar(2, 7);
		double division = calculadora.dividir(10, 4);
		double promedio = calculadora.promediar(4,10,7);
		
		calculadora.mostrarResultado();
	}

}
