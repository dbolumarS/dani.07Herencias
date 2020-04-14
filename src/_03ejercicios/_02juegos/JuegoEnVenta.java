package _03ejercicios._02juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta{
	
	public JuegoEnVenta(String t, String f, int a, double p, int c){
		super(t,f,a,p,c);
	}
	public boolean vender(){
		return reducirCopias();
	}
}
