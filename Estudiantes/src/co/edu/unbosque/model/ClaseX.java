package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	
	public ClaseX() {
		y = new ClaseY();
	}

	public String procesarDato(String dato) {
		int c=7;
		if(c >= 7)
			System.out.println("ffff");

		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	
}
