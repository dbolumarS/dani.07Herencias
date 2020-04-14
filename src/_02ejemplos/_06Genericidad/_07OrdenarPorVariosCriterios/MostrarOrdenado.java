package _02ejemplos._06Genericidad._07OrdenarPorVariosCriterios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * En esta clase mostramos los vehículos que cumplen determinada condición.
 * Para decidir qué objetos hay que imprimir y cuales no se untiliza 
 * una clase que implementa el interfaz Filtro, que se ha añadido al paquete
 *
 * La clase que filtra los vehículos se crea "al vuelo". Son las llamadas "clases anonimas",
 * porque no tienen nombre. Solo se especifíca el interfaz al que pertenece y su contenido
 * 
 */
public class MostrarOrdenado {
	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("Miguel",10));
		listaPersonas.add(new Persona("Ana",12));
		listaPersonas.add(new Persona("Rosa",8));
		listaPersonas.add(new Persona("Pedro",18));
		
		System.out.println(listaPersonas);
		
		//Ordenacion segun el compareTo de Persona
		Collections.sort(listaPersonas);
		System.out.println(listaPersonas);
		
		//Ordenacion por edad
		Collections.sort(listaPersonas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2) {
				if(p1.getEdad()< p2.getEdad()) return -1;
				else if(p1.getEdad() > p2.getEdad()) return 1;
				return 0;
				
			}
			
		});
		System.out.println(listaPersonas);
		
		Collections.sort(listaPersonas, new Comparator<Persona>(){
			@Override
			public int compare(Persona p1, Persona p2) {
				if(p1.getEdad() > p2.getEdad()) return -1;
				else if(p1.getEdad() < p2.getEdad()) return 1;
				return 0;
				
			}
			
		});
		System.out.println(listaPersonas);
	}
}
