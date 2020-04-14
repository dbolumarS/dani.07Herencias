package _02ejemplos._07MetodosGenericos;

import _02ejemplos._06Genericidad._01equipos.Baloncestista;
import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class _02Test {
	public static void main(String[] args) {
		String[] v = {"A","B","C"};
		System.out.println(_02ConGenericidad.esta(v,"d"));
		
		System.out.println(_02ConGenericidad.maximo("casa","arbol"));
		System.out.println(_02ConGenericidad.maximo(new Futbolista("Angel",false),new Futbolista("Miguel",false)));
		System.out.println(_02ConGenericidad.maximo(new Baloncestista("Angel"),new Baloncestista("Miguel")));
		
		System.out.println(_02ConGenericidad.maximo2(new Futbolista("Angel",false),new Futbolista("Miguel",false)));
		//No se puede llamar a maximo2 con un array de Baloncestista
		//System.out.println(_02ConGenericidad.maximo2(new Baloncestista("Angel"),new Baloncestista("Miguel")));
		
	}

}
