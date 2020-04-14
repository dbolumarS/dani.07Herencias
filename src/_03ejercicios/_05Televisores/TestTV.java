package _03ejercicios._05Televisores;

import java.util.ArrayList;

public class TestTV {
	public static void main(String[] args) {
		ArrayList<Televisor> t = new ArrayList<>();

		t.add(new TVTubo("Sony", "Color", 2000, 25.1, 420));
		t.add(new TVLCD("LG", "Bonico", 1999, 45.7, 800,600));
		t.add(new TVTubo("HP", "Negro", 1560, 35.1, 430));
		t.add(new TVLCD("LG", "Bonico", 1876, 35.7, 700,500));
		
		for (Televisor televisor : t) {
			System.out.println(televisor.toString());
		}
	}
}
