package _02ejemplos._06Genericidad._01equipos._01singenericidad;

import _02ejemplos._06Genericidad._01equipos.Baloncestista;

public class TestEquipoBaloncesto {
	public static void main(String[] args) {
		EquipoBaloncesto equipo = new EquipoBaloncesto("Profes matisse");
		
		
		equipo.anyadir(new Baloncestista("Javi"));
		equipo.anyadir(new Baloncestista("Jorge"));
		equipo.anyadir(new Baloncestista("Esther"));
		equipo.anyadir(new Baloncestista("Chema"));
		equipo.setCapitan(new Baloncestista("Esther"));
		
		System.out.println(equipo);
		
	}

}
