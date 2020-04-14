package _02ejemplos._06Genericidad._07OrdenarPorVariosCriterios;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	public int getEdad() {
		return edad;
	}


	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return nombre + " - " + edad;
	}


	@Override
	public int compareTo(Persona o) {
		return nombre.compareTo(o.nombre);
	}

}
