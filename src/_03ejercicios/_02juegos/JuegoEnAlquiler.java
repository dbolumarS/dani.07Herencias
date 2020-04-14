package _03ejercicios._02juegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta{
	int dias;
	
	public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d){
		super(t,f,a,p,c);
		this.dias = d;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public String toString(){
		return super.toString() + 
				"\nDias: " + dias;
	}
	
	public boolean alquilar(){
		return reducirCopias();
	}

}
