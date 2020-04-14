package _02ejemplos._04animales;

public abstract class Felino extends Animal{
	public Felino (String nombre){
		super(nombre);
	}
	public void cortarGarras(){
		System.out.println("Se corta las garras a " + nombre);
	}
}
