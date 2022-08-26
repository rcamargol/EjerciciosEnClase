package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDato(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, mensaje);
		return dato;
	}
	
	public double pedirNota(String msg) {
		double numero = 0;
		numero = Double.parseDouble(JOptionPane.showInputDialog(null,msg));
		return numero;
	}

}
