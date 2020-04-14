package _02ejemplos._06Genericidad._01equipos._02congenericidad;

import _02ejemplos._06Genericidad._01equipos.Baloncestista;
import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class TestEquipo {
	public static void main(String[] args) {
		//Usando la clase genérica Equipo<T> puedo
		// crear equipos de cualquier cosa
		Equipo <Futbolista> eqFutbol = new Equipo<>("Profes matisse CF");
		eqFutbol.anyadir(new Futbolista("Javi",true));
		eqFutbol.anyadir(new Futbolista("Jorge",false));
		eqFutbol.anyadir(new Futbolista("Esther",false));
		eqFutbol.anyadir(new Futbolista("Chema",false));
		eqFutbol.setCapitan(new Futbolista("Esther",false));
		
		//En Equipo<Futbolista> solo se pueden aÃ±adir Futbolistas.
		//De lo contrario el programa no compila: 
		//eqFutbol.anyadir("Hola");
		//eqFutbol.anyadir(new Baloncestista("Antonio"));
		
		System.out.println(eqFutbol);
		
		Equipo <Baloncestista> eqBaloncesto = new Equipo<>("Matisse CB");
		eqBaloncesto.anyadir(new Baloncestista("Rafael"));
		eqBaloncesto.anyadir(new Baloncestista("Miguel"));
		eqBaloncesto.anyadir(new Baloncestista("Jose Luis"));
		eqBaloncesto.anyadir(new Baloncestista("Antonio"));
		
		eqBaloncesto.setCapitan(new Baloncestista("Antonio"));
		
		System.out.println(eqFutbol);
	}

}
