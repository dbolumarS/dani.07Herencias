package _03ejercicios._03figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;
	
	public Figura (int posX, int posY, String color){
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	public abstract double area();
	public abstract double perimetro();

	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		return String.format("Area: %f  - Color: %s - Pos: (%d,%d)", 
				area(), color,posX,posY);
	}
	

}
