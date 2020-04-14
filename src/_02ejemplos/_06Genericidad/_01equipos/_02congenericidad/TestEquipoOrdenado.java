package _02ejemplos._06Genericidad._01equipos._02congenericidad;

import _02ejemplos._06Genericidad._01equipos.Baloncestista;
import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class TestEquipoOrdenado {
	public static void main(String[] args) {
		EquipoOrdenado<String> eq1 = new EquipoOrdenado<>("nombres");
		eq1.anyadir("Miguel");
		eq1.anyadir("Bea");
		eq1.anyadir("Ana");
		eq1.setCapitan("Bea");
		System.out.println(eq1);
		
		
		EquipoOrdenado<Futbolista> eq2 = new EquipoOrdenado<>("Profes matisse");
		
		
		eq2.anyadir(new Futbolista("Javi",true));
		eq2.anyadir(new Futbolista("Jorge",false));
		eq2.anyadir(new Futbolista("Esther",false));
		eq2.anyadir(new Futbolista("Chema",false));
		eq2.setCapitan(new Futbolista("Esther",false));
		
		System.out.println(eq2);	
		
		//La siguiente instrucción no compila porque Baloncestista
		//no implementa Comparable
		
		//EquipoOrdenado <Baloncestista> eqBaloncesto = new EquipoOrdenado<>("Matisse CB");
		
	}
}
