package _02ejemplos._06Genericidad._02InterfacesGenericos;

public class Persona implements Comparable2<Persona> {
	String nombre;
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	public int compareTo2(Persona o){
		return -1;
	}
}
