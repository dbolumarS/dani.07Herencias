package _03ejercicioGenericidad._01Ejercicio;

import java.util.ArrayList;

public class Conjunto <T> implements Coleccion<T>{

	private ArrayList<T> elementos;

	public Conjunto() {
		elementos= new ArrayList();
	}

	@Override
	public void agregar(T x) {
		if(!elementos.contains(x)) {
			elementos.add(x);
		}
		
	}
	
	@Override
	public void eliminar(T x) {
		if(elementos.contains(x)) {
			elementos.remove(x);
		}
		
	}
	
	@Override
	public boolean estaVacia(T x) {
		return elementos.isEmpty();
		//return elementos.size() == 0;
		//return talla() == 0;
		}
	
	@Override
	public int talla() {
		if (elementos.size() > 0) {
			return elementos.size();
		}
		return 0;
	}
	
	@Override
	public boolean contiene(T x) {
		if(elementos.contains(x)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String result = "";
		for (T x :elementos ) {
			
		}
		return elementos.toString();
	}
}
