package _03ejercicios._04Monedas;

public class Billetes extends Dinero{
	
	private double altura;
	 private double anchura; 
	
	public Billetes(double valor, int anyo, double altura, double anchura) {
		super(valor, anyo);
		this.altura = altura;
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	@Override
	public String toString() {
		return "Billete: " + super.toString() + ", Altura " + this.altura + ", Anchura " + this.anchura;
	}
	
 
}
