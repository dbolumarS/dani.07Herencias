package _02ejemplos._06Genericidad._02parejas;

import _02ejemplos._04animales.Perro;
import _02ejemplos._06Genericidad._01equipos.Baloncestista;
import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class TestParejas {
	public static void main(String[] args) {
		//Una pareja de baile
		Pareja<String,String> p1 = new Pareja<>("Fred A.","Ginger R.");
		System.out.println(p1);
		
		//Pareja: Baloncestista y nombre de su entrenador
		Pareja<String, Baloncestista> p2 
			= new Pareja<>("Luis",new Baloncestista("Pepe"));
		System.out.println(p2);
		
		//Pareja: Mascotas de futbolistas
		Pareja <Futbolista, Perro> p3
			= new Pareja<>(new Futbolista("Antonio",false), new Perro("Lassy"));
			
		System.out.println(p3);
		
	}
}
