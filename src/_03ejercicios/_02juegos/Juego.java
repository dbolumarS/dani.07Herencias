package _03ejercicios._02juegos;

public class Juego {
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	
	public Juego (String titulo, String fabricante, int anyo){
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = anyo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof Juego)) return false;
		
		Juego j = (Juego) o;
		
		return this.titulo.equals(j.titulo) &&
				this.fabricante.equals(fabricante) &&
				this.anyo == j.anyo;
	}
	
	public int compareTo(Juego j){
		if(this.titulo.compareTo(j.titulo) < 0) return -1;
		else if(this.titulo.compareTo(j.titulo) > 0) return 1;
		else if (this.fabricante.compareTo(j.fabricante) < 0) return -1;
		else if (this.fabricante.compareTo(j.fabricante) > 0) return 1;
		else if(this.anyo < j.anyo) return -1;
		else if(this.anyo > j.anyo) return 1;
		else return 0;
		
	}
	public int compareTo2(Juego j){
		int compTitulo = this.titulo.compareTo(j.titulo);
		if(compTitulo != 0) return compTitulo;

		int compFabr = this.fabricante.compareTo(j.fabricante);
		if(compFabr != 0) return compFabr;
		
		return this.anyo - j.anyo;
		
	}

	@Override
	public String toString() {
		return "titulo: " + titulo + 
				"\nfabricante: " + fabricante + 
				"\naño: " + anyo;
	}
	

}
