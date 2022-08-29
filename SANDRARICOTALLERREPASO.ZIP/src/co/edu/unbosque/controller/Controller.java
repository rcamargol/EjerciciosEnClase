package co.edu.unbosque.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.EjercicioArreglo1;
import co.edu.unbosque.model.EjercicioArreglo2;
import co.edu.unbosque.model.EjercicioArreglo3;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	private EjercicioArreglo1 arregloEj1;
	private EjercicioArreglo2 arregloEj2;
	private EjercicioArreglo3 arregloEj3;

	public Controller(){
		vista = new VistaConsola();
		funcionar();
		funcionar2();
		funcionar3();
	}

	public void funcionar(){
		vista.mostrarInformacion("Ejercicio 1 \r");
		int arreglo []= new int[10];
		for (int i=0; i<arreglo.length; i++) {
			vista.mostrarInformacion("Ingrese un número para la posición " + i +" del arreglo:");
			arreglo[i] = vista.leerDato();

		}
		arregloEj1 = new EjercicioArreglo1(arreglo);
		arregloEj1.calcularPromedio();		
		vista.mostrarInformacion("\r El promedio de su arreglo es:" + arregloEj1.calcularPromedio());		
		vista.mostrarInformacion("----------------------------------------------------------\n");

	}

	public void funcionar2() {
		vista.mostrarInformacion("Ejercicio 2 \r");
		int arreglo2 []= new int[20];
		for (int i=0; i<arreglo2.length; i++) {
			arregloEj2 = new EjercicioArreglo2(arreglo2);
		}
		vista.mostrarInformacion("Los primeros números pares del arreglo son: ");
		arregloEj2.calcularPares();	
		vista.mostrarInformacion("\r----------------------------------------------------------\n");

	}

	public void funcionar3() {
		
		vista.mostrarInformacion("Ejercicio 3 \r");
		int arreglo3[]= {2,-5,4,0,0,-11,-45,8,-78,78};
		arregloEj3 = new EjercicioArreglo3(arreglo3);
		vista.mostrarInformacion("El arreglo tiene:");
		arregloEj3.contador();
		

	}
}

