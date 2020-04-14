package _02ejemplos._04animales;

public class Gato extends Felino implements Mascota{
	public Gato(String nombre){
		super(nombre);
	}
	public void darDeComer(){
		System.out.println("Se da de comer sardinas a " + nombre);
	}
	public void llevarALaPelu(){
		System.out.println("Se lleva a la pelu a " + nombre);
	}
}
