package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		gui = new View();
		gui.mostrarMatriz(m.matricesPunto1(),4,4);
		gui.mostrarMatriz(m.matricesPunto2(),2,4);
	}
}
