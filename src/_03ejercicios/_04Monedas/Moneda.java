package _03ejercicios._04Monedas;

public class Moneda extends Dinero{
	
	private double diametro;
	 private double peso; 
	
	public Moneda(double valor, int anyo, double diametro, double peso) {
		super(valor, anyo);
		this.diametro = diametro;
		this.peso = peso;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Moneda: " + super.toString() + ", Diametro " + this.diametro + ", Peso " + this.peso;
	}
	
 
}
