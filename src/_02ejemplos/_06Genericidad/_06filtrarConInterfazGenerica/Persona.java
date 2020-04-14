package _02ejemplos._06Genericidad._06filtrarConInterfazGenerica;

public class Persona {
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return nombre;
	}

}
