package _03ejercicioGenericidad._02Ejercicio;

public class Genericos {
	public static <T extends Comparable <T>> T minimo(T o1, T o2) {
		if(o1.compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	
	public static <T extends Comparable <T>> T maximo (T[] v){
		T max = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i].compareTo(max) > 0) {
				max = v[i];
			}
		}
		return max;
	}
	
	public static <T> int numVeces (T [] v, T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) {
				cont++;
			}
		}
		return cont;
	}
	
	public static <T extends Comparable <T>> int numVecesOrdenado(T[ ] v, T x) {
		int cont = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			
			if(v[i].compareTo(x) > 0) enc = true; 
			
			else if(v[i].equals(x)) cont ++;
		}
		
		return cont;
	}
	
	public static <T extends Comparable <T>>int mayores(T v[], T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].compareTo(x) > 0) {
				cont ++;
			}
		}
		return cont;
	}
	
	public static <T> int mayoresOrdenado(T[] v, T x) {
		boolean enc = false;
		int cont = 0;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) {
				enc = true;
				for (int j = i+1; j < v.length; j++) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public static <T> boolean estaEn(T v[],T x) {
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	
	public static <T extends Comparable <T>>  boolean estaEnOrdenado(T v[],T x) {
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].compareTo(x) == 0) enc = true;
		}
		return enc;
	}
	
	public static <T> int posicionDe(T v[], T x) {
		boolean enc = false;
		int posi = -1;
		
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) {
				enc = true;
				posi = i;
			}
		}
		return posi;
	}
	
	public static <T extends Comparable <T>>  int posicionDeOrdenado(T v[],T x) {
		boolean enc = false;
		int posi = -1;
		
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].compareTo(x) == 0) {
				enc = true;
				posi = i;
			}
		}
		return posi;
	}
}
