package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;

	public ClaseX() {
		y = new ClaseY();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public double arreglosPunto1(int[] arreglo) {
		int suma = 0;
		double promedio = 0;
		for (int i = 0; i < arreglo.length; i++)
			suma += arreglo[i];
		promedio = suma / arreglo.length;
		return promedio;
	}

	public int[] arreglosPunto2() {
		int[] pares = new int[20];
		int contpar = 0, i = 0;
		while (contpar < 20) {
			if (i % 2 == 0) {
				pares[contpar] = i;
				contpar++;
			}
			i++;
		}
		return pares;
	}

	public void arreglosPunto3(int[] arreglo) {
		int pos, neg, cero;
		pos = neg = cero = 0;
		for (int i = 0; i < arreglo.length; ++i) {
			if (arreglo[i] > 0)
				pos++;
			else if (arreglo[i] < 0)
				neg++;
			else
				cero++;
		}
	}

	public int[][] matricesPunto1() {
		int[][] matriz = new int[4][4];
		int i, j;
		for (i = 0; i < 4; i++)
			for (j = 0; j < 4; j++) {
				if (i == j) { // diagonal
					matriz[i][j] = (int)Math.pow(2, j+1);
				}
				if (i == 3) { // ultima fila
					matriz[i][j] = j + 13;
				}
				if (j == 3) {// ultima columna
					matriz[i][j] = 4 * (i + 1);
				}
			}

		return matriz;
	}

	public int[][] matricesPunto2(){
		int[] A = {1,2,3,4};
		int[] B = {8,9,10,11};
		int[][] M = new int[2][4];
		int i;
		for(i=0 ; i<4 ; ++i) {
			M[0][i] = A[i];
			M[1][i] = B[i];
		}
		return M;
	}
	
	public int sumar20alDato(int dato) {
		return dato + 20;
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

}
