package _03ejercicioGenericidad._03Ejercicio;

public class Dvd extends Publicacion implements Prestable{

	public double duracion;
	boolean prestado = false;
	
	public Dvd(int codigo, String titulo, String anyo, double duracion) {
		super(codigo, titulo, anyo);
		this.duracion = duracion;
	}
	
	public String toString() {
		return "DvD: " + super.toString() + this.duracion;
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
}
