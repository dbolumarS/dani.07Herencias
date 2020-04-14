package _02ejemplos._03interfaces;

import java.util.ArrayList;

import _02ejemplos._01alumnos.Persona;

public class ListaDeEspera implements Cola {
	// Cuando una clase implementa un interface,
	// adquiere la obligación de implementar todos
	// los métodos que el interface define

	// Si no se implementan todos, la clase tendrá
	// que ser abstracta.
	
	ArrayList<Persona> lista = new ArrayList<>();
	
	@Override
	public void encolar(Object o) {
		//Añadimos al final de la lista
		lista.add((Persona) o);
	}

	@Override
	public Object desencolar() {
		//Quitamos el primer elemento de la lista y lo devolvemos
		Object o = lista.remove(0);
		return o;
	}

	@Override
	public int getTamanyo() {
		//Devolvemos el numero de personas en la lista
		return lista.size();
	}

}
