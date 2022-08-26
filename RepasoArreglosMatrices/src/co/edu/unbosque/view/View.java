package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public String pedirDato() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, "Entre Dato:");
		return dato;
	}

	public int pedirDatoEntero() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre N�mero:"));
		return numero;
	}

	public int[] cargarArreglo() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = pedirDatoEntero();
		}
		return arr;
	}

	public void mostrarMatriz(int[][] mat,int fil, int col) {
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
