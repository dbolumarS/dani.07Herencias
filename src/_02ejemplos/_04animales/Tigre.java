package _02ejemplos._04animales;

public class Tigre extends Felino{
	public Tigre(String nombre){
		super(nombre);
	}
	public void darDeComer(){
		System.out.println("Se da de comer cebra a " + nombre);
	}
}
