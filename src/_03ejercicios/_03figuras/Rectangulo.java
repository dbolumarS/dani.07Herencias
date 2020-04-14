package _03ejercicios._03figuras;

public class Rectangulo extends Figura {
	private int ancho;
	private int alto;
	
	public Rectangulo(int posX, int posY, String color, int ancho, int alto) {
		super(posX, posY, color);
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String toString(){
		return "Rectangulo: " + super.toString() + 
				String.format(" - Tamanyo: (%d,%d)", ancho,alto);
	}

	public double area() {
		return ancho * alto;
	}

	public double perimetro() {
		return 2* ancho + 2 * alto;
	}
}
