package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjercicioArreglo2 {

	private int [] numeros;



	public EjercicioArreglo2(int[] numeros) {
		super();
		this.numeros = numeros;
	}


	public void calcularPares () {
	 
		for(int i=0 ; i<numeros.length; i++) {
			if (i%2==0) {
				numeros[i]=i;
				System.out.print(numeros[i]+ " ");
			}

		}

	}


	@Override
	public String toString() {
		return "EjercicioArreglo2 [numeros=" + numeros + "]";
	}


}


