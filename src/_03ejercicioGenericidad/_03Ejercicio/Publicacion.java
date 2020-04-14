package _03ejercicioGenericidad._03Ejercicio;

public class Publicacion {

	private int codigo;
	private String titulo;
	private String anyo;
	
	public Publicacion(int codigo,  String titulo, String anyo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}
	
	public String toString() {
		return this.codigo + " - " + this.titulo + " - " + this.anyo;
	}
}
