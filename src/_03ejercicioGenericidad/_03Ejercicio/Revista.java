package _03ejercicioGenericidad._03Ejercicio;

public class Revista extends Publicacion{

	private int nRevista;
	
	public Revista(int codigo, String titulo, String anyo, int nRevista) {
		super(codigo, titulo, anyo);
		this.nRevista = nRevista;
	}
	
	public String toString() {
		return "Revista: " + super.toString() + " - " + this.nRevista;
	}
}


