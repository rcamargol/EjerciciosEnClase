package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.NoMeGustaElNumeroException;
import co.edu.unbosque.model.NumeroChimboException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		try {
			m.probarExcepciones();
		} catch (NumeroChimboException | NoMeGustaElNumeroException e) {
			// TODO Auto-generated catch block
			//gui.mostrarResultados("Devuelvase pa'fundamentos!");
			gui.mostrarResultados(e.getMessage());
		}
	}
}
