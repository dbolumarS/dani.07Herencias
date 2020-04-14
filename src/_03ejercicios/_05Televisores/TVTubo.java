package _03ejercicios._05Televisores;

public class TVTubo extends Televisor {

	private int lineas;

	public TVTubo(String marca, String modelo, int euros, double pulgadas, int lienas) {
		super(marca, modelo, euros, pulgadas);
		this.lineas = lineas;
	}

	public int getLineas() {
		return lineas;
	}

	public void setLineas(int lineas) {
		this.lineas = lineas;
	}

	public String resolucion() {
		return this.lineas + " lineas";
	}
	
	@Override
	public String toString() {
		return "TVTubo : " + super.toString() + ", Resolucion :  " + resolucion();
	}
}
