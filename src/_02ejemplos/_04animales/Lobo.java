package _02ejemplos._04animales;

public class Lobo extends Canino{
	public Lobo(String nombre){
		super(nombre);
	}
	public void darDeComer(){
		System.out.println("Se da de comer oveja a " + nombre);
	}
}
