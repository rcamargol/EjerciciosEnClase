package co.edu.unbosque.model;

import java.util.Arrays;

public class EjercicioArreglo1 {

	private int [] numeros; 

	public EjercicioArreglo1(int[] numeros) {
		this.numeros = numeros;
	}


	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
 

	@Override
	public String toString(){
		String rta = "";
		for(int x : numeros){
			rta += x + " "; 
		}
		return rta;
	}

	public double calcularPromedio() {
		int suma= 0;
		double promedio=0.0;
		for (int i=0; i<numeros.length; i++) {
			suma += numeros[i];
			promedio= suma/numeros.length;	
		}

		return promedio;

	}
}
