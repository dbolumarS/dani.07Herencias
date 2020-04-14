package _03ejercicios._03figuras;

public class Circulo extends Figura {
	private int radio;

	public Circulo(int posX, int posY, String color, int radio) {
		super(posX, posY, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	public String toString(){
		return "Circulo: " + super.toString() + 
				String.format(" - Radio: %d", radio);
	}
	
	public double area(){
		return Math.PI * radio * radio;
	}

	public double perimetro() {
		return 2 * Math.PI * radio;
	}

}
