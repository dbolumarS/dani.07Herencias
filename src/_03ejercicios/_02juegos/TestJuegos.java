package _03ejercicios._02juegos;

public class TestJuegos {
	public static void main(String args[]) {
		Juego j = new Juego("Titulo1", "Fab1", 2000);

		JuegoEnAlquiler ja = new JuegoEnAlquiler("Tit2", "Fab1", 2000, 10, 5, 5);

		JuegoEnVenta jv = new JuegoEnVenta("Tit3", "Fab3", 2000, 10, 5);
		
		System.out.println(j);
		System.out.println("------");
		System.out.println(ja);
		System.out.println("------");
		System.out.println(jv);
		
		ja.reducirCopias();
		
		//JuegoAlquilerVenta jav = new JuegoAlquilerVenta("Tit3", "Fab3", 2000, 10, 5);

	}

}
