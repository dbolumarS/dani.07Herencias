package _02ejemplos._07MetodosGenericos;

import _02ejemplos._01alumnos.Persona;
import _03ejercicios._03figuras.Figura;

public class _02ConGenericidad {
	
	//Sin notación de diamante
	public static boolean esta (Object[] v, Object x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	//Con notación de diamante
	public static <T> boolean esta2 (T [] v, T x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	
	//Devolver el maximo de dos objetos cualesquiera
	//Sin notación de diamante
	public static Object maximo (Object a, Object b){
		if(((Comparable)a).compareTo(b) > 0) return a;
		else return b;
	}
	//Con notación de diamante
	public static <T extends Comparable<T>> T maximo2 (T a, T b){
		if(a.compareTo(b) > 0) return a;
		else return b;
	}
	
	//Hacer un método genérico que devuelva el elemento mas grande de un
	//array de objetos
	//Sin notación de diamante
	public static Object maximo (Object[] v){
		Object max = v[0];
		for (int i = 1; i < v.length; i++) {
			if(((Comparable)v[i]).compareTo(max) > 0) max = v[i];
		}
		return max;
	}
	public static <T extends Comparable<T>> T maximo2 (T [] v){
		T max = v[0];
		for (int i = 1; i < v.length; i++) {
			if(v[i].compareTo(max) > 0) max = v[i];
		}
		return max;
	}
	
	//Método que devuelva la suma de un array de numeros
	
	public static <T extends Number> int suma (T[] v){
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i].intValue();
		}
		return suma;
	}
}
