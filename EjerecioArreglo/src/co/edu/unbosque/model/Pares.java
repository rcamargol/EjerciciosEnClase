package co.edu.unbosque.model;

public class Pares {

	
	int p[]= new int [20];
	
	
	public void rellenarConPares(int[] p) {
		int i = 0;
		for (int par = 2; i < p.length; par += 2) {
			p[i] = par;
			i++;
		}
	}
		
	}

