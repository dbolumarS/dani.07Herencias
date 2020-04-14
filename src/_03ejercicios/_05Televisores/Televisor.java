package _03ejercicios._05Televisores;

public abstract class Televisor {
	private String marca;
	private String modelo;
	private int euros;
	private double pulgadas;
	
	public Televisor(String marca, String modelo, int euros, double pulgadas) {
		this.marca = marca;
		this. modelo = modelo;
		this.euros = euros;
		this. pulgadas = pulgadas;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getEuros() {
		return euros;
	}

	public void setEuros(int euros) {
		this.euros = euros;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		else if(o == null) return false;
		else if(!(o instanceof Televisor)) return false;
		
		Televisor t = (Televisor) o;
		if(t.marca == this.marca && t.modelo == this.modelo) return true;
		else return false;
	}
	
	public int compareTo(Televisor t) {
		int res = 0;
		if(t.marca.compareTo(this.marca) == 1) res = 1;
		else if(t.marca.compareTo(this.marca) == -1) res = -1;
		else if(t.marca.compareTo(this.marca) == 0) {
			if(t.modelo.compareTo(this.modelo) == 1) res = 1;
			else if(t.modelo.compareTo(this.modelo) == -1) res = -1;
		}
		
		return res;
	}
	
	public String toString() {
		return "Marca : " + this.marca + ", Modelo : " + this.modelo + ", Euros : " + this.euros + ", Pulgadas : " + this.pulgadas; 
	}
	
}
