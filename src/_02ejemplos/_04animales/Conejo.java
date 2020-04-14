package _02ejemplos._04animales;

public class Conejo extends Felino implements Mascota{
	public Conejo(String nombre){
		super(nombre);
	}
	public void darDeComer(){
		System.out.println("Se da de comer lechuga a " + nombre);
	}
	public void llevarALaPelu(){
		System.out.println("Se lleva a la pelu a " + nombre);
	}
}
