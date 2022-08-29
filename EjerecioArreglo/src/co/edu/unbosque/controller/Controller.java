package co.edu.unbosque.controller;

import java.util.Arrays;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Pares;
import co.edu.unbosque.model.Promedio;
import co.edu.unbosque.view.View;


public class Controller {

	
	private Promedio p;
	private View v;
	private Pares pr;
	
	public Controller(){
		v= new View();
		p= new Promedio();
		pr = new Pares();
		ejercicioPares();
		}
		public void ejercicioPares() {
		int[] p = new int[20];
		pr.rellenarConPares(p);
		String resultado = "Pares generados:\n" + Arrays.toString(p);
		JOptionPane.showMessageDialog(null, resultado);
		}
		public void ejercicioAreglo() {
		v.cargarArreglo(p.realizarPromedio());
		
		
		
		
		
		}
		
	}


