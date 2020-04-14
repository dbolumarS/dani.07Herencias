package _03ejercicioGenericidad._05Filtros;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.function.Predicate;

import _03ejercicioGenericidad._03Ejercicio.Dvd;
import _03ejercicioGenericidad._03Ejercicio.Libro;
import _03ejercicioGenericidad._03Ejercicio.Publicacion;

public class Filtros {
	public static void main(String[] args) {
		ArrayList<Publicacion> lista = new ArrayList<>();
		lista.add(new Libro(1, "L1", "2000"));
		lista.add(new Libro(2, "L2", "2000"));
		lista.add(new Libro(3, "L3", "2000"));
		lista.add(new Libro(4, "L4", "2000"));
		lista.add(new Dvd(5, "D1", "2000", 50));
		lista.add(new Dvd(6, "D2", "2000", 50));
		lista.add(new Dvd(7, "D3", "2000", 50));
		lista.add(new Dvd(8, "D4", "2000", 50));

		// Publicaciones ciyo codico de publicacion par
		mostrarPublicaciones(lista, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p) {
				if (p.getCodigo() % 2 == 0)	return true;
				else return false;
			}
		});
		
		//Expresion lamda, en lugar de dar el codigo dar solo lo que java no sabe deducir
		mostrarPublicaciones(lista, (p)-> p.getCodigo() % 2 == 0);
		
		//Publicaciones cuyo titulo tiene longitud > 5
		mostrarPublicaciones(lista, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p) {
				if(p.getTitulo().length() > 5 ) return true;
				else return false;
			}
		});
		
		//Expresion lamda
		mostrarPublicaciones(lista, (p)-> p.getTitulo().length() > 5);
		
		
		//publicaciones del a�o actual
		mostrarPublicaciones(lista, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p) {
				if(p.getAnyo() == Calendar.getInstance().get(Calendar.YEAR)) return true;
				else return false;
			}
		});
		
		//Expresion lamba
		mostrarPublicaciones(lista, (p)-> p.getAnyo() == Calendar.getInstance().get(Calendar.YEAR));
		
		//publicacionesw entre el 2000 y 2005 y contiene la palabra casa
		mostrarPublicaciones(lista, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p) {
				if(p.getAnyo() > 2000 & p.getAnyo() < 2005 & p.getTitulo().contains("casa")) return true;
				else return false;
			}
		});
		
	}

	private static void mostrarPublicaciones(ArrayList<Publicacion> l, Predicate<Publicacion> filtro) {
		for (Publicacion p : l) {
			if(filtro.test(p)) {
				System.out.println(p);
			}
		}
		
	}
}
