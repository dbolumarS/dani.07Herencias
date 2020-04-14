package _03ejercicios._03figuras;

public class Cuadrado extends Figura {
	private int lado;
	
	public Cuadrado(int posX, int posY, String color, int lado) {
		super(posX, posY, color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public String toString(){
		return "Cuadrado: " + super.toString() + 
				String.format(" - Lado: %d ", lado);
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}
	
}
