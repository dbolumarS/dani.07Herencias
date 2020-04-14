package _03ejercicios._04Monedas;

import java.util.ArrayList;



public class TestDinero {

	public static void main(String[] args) {
		ArrayList<Dinero> d = new ArrayList<>();
		
		d.add(new Billetes(5,2000, 20,50));
		d.add(new Moneda(2, 2010, 10, 5));
		
		for (Dinero dinero : d) {
			System.out.println(dinero.toString());
		}
	}
	
}
