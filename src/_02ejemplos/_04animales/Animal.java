package _02ejemplos._04animales;

public abstract class Animal {
	protected String nombre;
	
	public Animal(String nombre){
		this.nombre = nombre;
	}
	
	public abstract void darDeComer();

}
