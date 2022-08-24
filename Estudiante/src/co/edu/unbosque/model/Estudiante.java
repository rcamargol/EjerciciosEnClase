package co.edu.unbosque.model;

public class Estudiante {
	
	private int nota;
	private String nombre;
	private String universidad;
	
	//Aqui van los getters y setters
	
	public Estudiante(String nombre, String univ, int nota) {
		this.nombre = nombre;
		this.universidad = univ;
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
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
