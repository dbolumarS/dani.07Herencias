package _02ejemplos._04animales;

public class Perro extends Canino implements Mascota{
	public Perro(String nombre){
		super(nombre);
	}
	public void darDeComer(){
		System.out.println("Se da de comer huesos a " + nombre);
	}
	public void llevarALaPelu(){
		System.out.println("Se lleva a la pelu a " + nombre);
	}
}
