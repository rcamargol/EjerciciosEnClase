package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjercicioArreglo3 {

	private int [] numeros;



	public EjercicioArreglo3(int[] numeros) {
		super();
		this.numeros = numeros;
	}


	public void contador () {
		int positivo = 0;
		int negativo = 0; 
		int cero = 0;

		for(int i=1 ; i<numeros.length; i++) {
			if (numeros[i]>0) {
				positivo ++;
				
			}
			if (numeros[i]<0) {
				negativo ++;
				
				
			}
			if (numeros[i]==0) {
				cero ++;
				
			}
		
		}
		
		System.out.println(positivo + " números positivos");
		System.out.println(negativo + " números negativos" );
		System.out.println(cero + " números cero");
	}





}


