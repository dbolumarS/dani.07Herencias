package _02ejemplos._05Comparacion;

import java.util.Arrays;

public class Ordenacion {
	/**
	 * Ordena un array de int usando el algoritmo
	 * de selección directa
	 * @param v el array a ordenar
	 */
	public static void ordenar(int[] v){
		for (int i = 0; i < v.length; i++) {
			//Buscamos el menor elemento de array
			//a partir de la posicion i
			int posMin = i;
			for (int j = i; j < v.length; j++) {
				if(v[j] < v[posMin]) {
					posMin = j;
				}
			}
			//Intercambiamos el menor con el i
			int aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
			
		}
	}

	public static void ordenar(double[] v){
		for (int i = 0; i < v.length; i++) {
			//Buscamos el menor elemento de array
			//a partir de la posicion i
			int posMin = i;
			for (int j = i; j < v.length; j++) {
				if(v[j] < v[posMin]) {
					posMin = j;
				}
			}
			//Intercambiamos el menor con el i
			double aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
			
		}
	}
	
	
	public static void ordenar(Object[] v){
		for (int i = 0; i < v.length; i++) {
			//Buscamos el menor elemento de array
			//a partir de la posicion i
			int posMin = i;
			for (int j = i; j < v.length; j++) {
				if(((Comparable)v[j]).compareTo(v[posMin]) < 0) {
					posMin = j;
				}
			}
			//Intercambiamos el menor con el i
			Object aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
			
		}
	}
	
}
