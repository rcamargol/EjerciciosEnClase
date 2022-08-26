package co.edu.unbosque.model;

public class Estudiante {
	
	private double nota;
	private String nombre;
	private String universidad;

	public Estudiante() {
		this.nota = 0;
		this.nombre = "";
		this.universidad = "";
	}

	//Aqui van los getters y setters

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	

	
}
