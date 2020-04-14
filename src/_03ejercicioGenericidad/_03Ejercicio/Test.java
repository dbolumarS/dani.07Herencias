package _03ejercicioGenericidad._03Ejercicio;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test{
	public static void main(String[] args) {
		ArrayList<Publicacion> p = new ArrayList<>();
		p.add(new Dvd(1, "DvD1", "2010", 120));
		p.add(new Libro(2,"Libro1", "2011"));
		p.add(new Dvd(3, "DvD2", "2012", 130));
		p.add(new Libro(4,"Libro2", "2013"));
		p.add(new Dvd(5, "DvD3", "2014", 140));
		p.add(new Libro(6,"Libro3", "2015"));
		p.add(new Dvd(7, "DvD4", "2016", 150));
		p.add(new Libro(8,"Libro4", "2017"));
		
		//Poner prestar
	((Prestable)p.get(0)).prestado();
	((Prestable)p.get(1)).prestado();
	
	((Prestable)p.get(3)).prestado();
	((Prestable)p.get(4)).prestado();
		
	//Mostrar titulos
		for (Publicacion pub : p) {
			System.out.println(pub.getTitulo());
		}
		
	/*	//Contar prestadas
		int cont = 0;
		for (Publicacion pub : p) {
			if(((Prestable)pub).getPrestado()) {
				cont++;
			}
		}*/
		
		//Ordenar por codigo
		Collections.sort(p, new Comparator<Publicacion>(){
			@Override
			public int compare(Publicacion p1, Publicacion p2) {
				if(p1.getCodigo() < p2.getCodigo()) return -1;
				else if(p1.getCodigo() > p2.getCodigo()) return 1;
				else return 0;
			}
		});
		System.out.println(p);
		
		Collections.sort(p, new Comparator<Publicacion>(){
			@Override
			public int compare(Publicacion p1, Publicacion p2) {
				if(p1.getTitulo().compareTo(p2.getTitulo()) < 0) return -1;
				else if(p1.getTitulo().compareTo(p2.getTitulo()) > 0) return 1;
				else return 0;
			}
		});
		System.out.println(p);
		
		Collections.sort(p, new Comparator<Publicacion>(){
			@Override
			public int compare(Publicacion p1, Publicacion p2) {
				if(p1.getAnyo().compareTo(p2.getAnyo()) < 0) return -1;
				else if(p1.getAnyo().compareTo(p2.getAnyo()) > 0) return 1;
				else return 0;
			}
		});
		System.out.println(p);
		
		Collections.sort(p, new Comparator<Publicacion>(){
			@Override
			public int compare(Publicacion p1, Publicacion p2) {
				if(p2.getAnyo().compareTo(p1.getAnyo()) < 0) return -1;
				else if(p2.getAnyo().compareTo(p1.getAnyo()) > 0) return 1;
				else return 0;
			}
		});
		System.out.println(p);
	}
}
