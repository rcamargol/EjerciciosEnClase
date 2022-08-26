package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;
import co.edu.unbosque.model.*;

public class Controller {
	
	private  PromedioNotas prom;
	private View gui;
	
	public Controller() {
		prom = new PromedioNotas();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		prom.getE1().setNombre(gui.pedirDato("Digite Nombre 1:"));
		prom.getE1().setUniversidad(gui.pedirDato("Digite Universidad:"));
		prom.getE1().setNota(gui.pedirNota("Digite Definitiva:"));
		
		prom.getE2().setNombre(gui.pedirDato("Digite Nombre 2:"));
		prom.getE2().setUniversidad(gui.pedirDato("Digite Universidad:"));
		prom.getE2().setNota(gui.pedirNota("Digite Definitiva:"));
		
		prom.getE3().setNombre(gui.pedirDato("Digite Nombre 3:"));
		prom.getE3().setUniversidad(gui.pedirDato("Digite Universidad:"));
		prom.getE3().setNota(gui.pedirNota("Digite Definitiva:"));
		
		prom.getE4().setNombre(gui.pedirDato("Digite Nombre 4:"));
		prom.getE4().setUniversidad(gui.pedirDato("Digite Universidad:"));
		prom.getE4().setNota(gui.pedirNota("Digite Definitiva:"));
		
		prom.getE5().setNombre(gui.pedirDato("Digite Nombre 5:"));
		prom.getE5().setUniversidad(gui.pedirDato("Digite Universidad:"));
		prom.getE5().setNota(gui.pedirNota("Digite Definitiva:"));
		
		prom.calcularPromedio(
				prom.getE1().getNota(), 
				prom.getE2().getNota(), 
				prom.getE3().getNota(), 
				prom.getE4().getNota(), 
				prom.getE5().getNota()
				);
		
		gui.mostrarResultados("El promedio es:" + prom.getPromedio());
	}

}
