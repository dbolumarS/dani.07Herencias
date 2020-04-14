package _03ejercicioGenericidad._03Ejercicio;

public class Libro extends Publicacion implements Prestable{

	boolean prestado = false;
	
	public Libro(int codigo, String titulo, String anyo) {
		super(codigo, titulo, anyo);
	}

	@Override
	public void prestado() {
		
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
		
	}

	@Override
	public void getPrestado() {
		this.prestado = prestado;
		
	}
	
	public String toString() {
		return "Libro: " + super.toString();
	}

}
