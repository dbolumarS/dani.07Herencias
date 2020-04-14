package _03ejercicios._01aulas;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;
	

		
	public Aula(int codigo, double longitud, double anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	
	public int capacidad(){
		return (int) (longitud * anchura / 1.4);
	}
	
	public String toString(){
		return this.codigo + " - Superf.: " + (longitud*anchura) + 
				" - " + capacidad() + " alumnos"; 
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
}
