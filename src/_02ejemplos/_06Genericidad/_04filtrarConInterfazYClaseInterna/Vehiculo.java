package _02ejemplos._06Genericidad._04filtrarConInterfazYClaseInterna;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String color;
	private int anyoMatricula;
	
	public Vehiculo(String matricula, String marca, String color, int anyoMatricula) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.anyoMatricula = anyoMatricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", color=" + color
				+ ", anyoMatricula=" + anyoMatricula + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public int getAnyoMatricula() {
		return anyoMatricula;
	}
	
	

}
