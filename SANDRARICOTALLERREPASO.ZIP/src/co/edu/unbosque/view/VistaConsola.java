package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaConsola {
	private Scanner leer;



	public VistaConsola() {
		leer= new Scanner(System.in);

	}

	public void mostrarInformacion(String mensaje){
		System.out.println(mensaje);

	}

	public int leerDato() {
		int dato= 0;
		dato = leer.nextInt();
		return dato;

	}
	
}
