package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {
	
	Scanner teclado = new Scanner(System.in);
	
	public int [] hacereArreglo() {
		int [] a = new int[10];
		for(int i = 0; i<a.length; i++){
	        System.out.printf("Introduzca numero : ", i+1);
			a[i] = teclado.nextInt();
	    }    
		return a;
	}
	
	public void mostrarArreglo() {
		
	}

	public int[] cargarArreglo(int j) {
		int [] arr = new int[10];
		for(int i=0;i <10; i++) {
			arr[i]= pedirDatoEntero();
		}
		return arr;
	}

	private int pedirDatoEntero() {
		int numero = 0;
		numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Numero:"));
		return numero;
	}
	
		
	
}


