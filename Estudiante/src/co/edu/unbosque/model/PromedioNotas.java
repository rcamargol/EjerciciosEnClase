package co.edu.unbosque.model;

public class PromedioNotas {
	
	private Estudiante e1, e2, e3, e4, e5;
	private double promedio;
	
	public PromedioNotas() {
		e1 = new Estudiante();
		e2 = new Estudiante();
		e3 = new Estudiante();
		e4 = new Estudiante();
		e5 = new Estudiante();
		this.promedio = 0;
	}
	
	public void calcularPromedio(double a, double b, double c, double d, double e) {
		double suma = a + b + c + d + e;
		this.promedio = (double)(suma/5);
	}

	public Estudiante getE1() {
		return e1;
	}

	public void setE1(Estudiante e1) {
		this.e1 = e1;
	}

	public Estudiante getE2() {
		return e2;
	}

	public void setE2(Estudiante e2) {
		this.e2 = e2;
	}

	public Estudiante getE3() {
		return e3;
	}

	public void setE3(Estudiante e3) {
		this.e3 = e3;
	}

	public Estudiante getE4() {
		return e4;
	}

	public void setE4(Estudiante e4) {
		this.e4 = e4;
	}

	public Estudiante getE5() {
		return e5;
	}

	public void setE5(Estudiante e5) {
		this.e5 = e5;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	
}
