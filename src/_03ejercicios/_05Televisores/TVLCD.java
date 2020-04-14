package _03ejercicios._05Televisores;

public class TVLCD extends Televisor {

	private int pixHor;
	private int pixVer;

	public TVLCD(String marca, String modelo, int euros, double pulgadas, int pixHor, int pixVer) {
		super(marca, modelo, euros, pulgadas);
		this.pixHor = pixHor;
		this.pixVer = pixVer;
	}

	

	public String resolucion() {
		return this.pixHor + "x" + this.pixVer + " pixeles";
	}
	
	@Override
	public String toString() {
		return "TVLDC : " + super.toString() + ", Resolucion :  " + resolucion();
	}
}
