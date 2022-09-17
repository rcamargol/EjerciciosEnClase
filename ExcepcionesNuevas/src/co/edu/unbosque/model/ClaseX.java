package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y, z;

	public ClaseX() {
		y = new ClaseY();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato + 20;
	}

	// empiece su método aquí profesor..

	public String probarExcepciones() throws NumeroChimboException, NoMeGustaElNumeroException {
		int i = 500;

		if (i > 40) {
			throw new NoMeGustaElNumeroException("Huy parce, estamos joches!");
		}

		if (i < 32) {
			throw new NumeroChimboException();
		}

		try {
			if (i < 10) {
				throw new NoMeGustaElNumeroException("Llevaos parce!");
			}
		} catch (NoMeGustaElNumeroException e) {
			return "Uich!!!";
		}

		return "";
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	/*
	 * public String generarExcepcion() throws NumerChimboException,
	 * NoSeaGuacheException { int i = 34; try { if(i < 10) { throw new
	 * NoMeGustaElNumeroException(); } } catch(NoMeGustaElNumeroException e) {
	 * return "Uich!!!"; }
	 * 
	 * if (i < -20) { throw new NoSeaGuacheException(); }
	 * 
	 * if(i > 20) { throw new NumerChimboException("SU numero es rechimbo!"); }
	 * 
	 * return "Ok!"; }
	 */

	public String checkAge(int age) {
		try {
			String x = z.hacerNada();

		} catch (NullPointerException e) {
			return "Ojo que no instanció z";
		}
		return "todo bien";
	}
}
