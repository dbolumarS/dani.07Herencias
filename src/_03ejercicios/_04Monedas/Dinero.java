package _03ejercicios._04Monedas;

public abstract class Dinero {
	private double valor;
	private int anyo;
	
	public Dinero(double valor, int anyo) {
		this.valor= valor;
		this. anyo = anyo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		else if(o == null) return false;
		else if(!(o instanceof Dinero)) return false;
		
		Dinero d = (Dinero) o;
		if(d.anyo == this.anyo && d.valor == this.valor) return true;
		else return false;
		
	}
	
	public int compareTo(Dinero d) {
		int compara = 0;
		if(d.valor == this.valor) {
			if(d.anyo > this.anyo) compara = 1;
			else compara = -1;
		}
		
		if(d.valor > this.valor) compara = 1;
			else if(d.valor < this.valor) compara = -1;
		
		return compara;
	}
	
	public String toString() {
		return "Valor " + this.valor + ", Anyo " + this.anyo;
	}
}
