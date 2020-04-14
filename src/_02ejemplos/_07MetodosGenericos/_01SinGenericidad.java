package _02ejemplos._07MetodosGenericos;

import _02ejemplos._01alumnos.Persona;
import _03ejercicios._03figuras.Figura;

public class _01SinGenericidad {
	//Devuelve true si en v está x
	public static boolean esta (int[] v, int x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i] == x) enc = true;
		}
		return enc;
	}
	public static boolean esta (double[] v, double x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i] == x) enc = true;
		}
		return enc;
	}
	public static boolean esta (String[] v, String x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	public static boolean esta (Persona[] v, Persona x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	public static boolean esta (Figura[] v, Figura x){
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].equals(x)) enc = true;
		}
		return enc;
	}
	//Método que devuelva el mas grande de dos elemento
	public static int maximo (int a, int b){
		if(a > b) return a;
		else return b;
	}
	public static double maximo (double a, double b){
		if(a > b) return a;
		else return b;
	}
	public static String maximo (String a, String b){
		if(a.compareTo(b) > 0) return a;
		else return b;
	}
}
