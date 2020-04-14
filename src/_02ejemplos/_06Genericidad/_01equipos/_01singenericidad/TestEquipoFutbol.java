package _02ejemplos._06Genericidad._01equipos._01singenericidad;

import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class TestEquipoFutbol {
	public static void main(String[] args) {
		EquipoFutbol equipo = new EquipoFutbol("Profes matisse");
		
		
		equipo.anyadir(new Futbolista("Javi",true));
		equipo.anyadir(new Futbolista("Jorge",false));
		equipo.anyadir(new Futbolista("Esther",false));
		equipo.anyadir(new Futbolista("Chema",false));
		equipo.setCapitan(new Futbolista("Esther",false));
		
		System.out.println(equipo);
		
	}

}
