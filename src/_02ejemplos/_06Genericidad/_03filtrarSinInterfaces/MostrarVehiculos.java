package _02ejemplos._06Genericidad._03filtrarSinInterfaces;

import java.util.ArrayList;
/**
 * En esta clase tenemos ejemplos de como filtrar una lista de vehiculos.
 * Por color, color y año, etc....
 * Si en lugar de con la clase Vehiculo, lo hicieramos con una clase un
 * poco más real (con bastantes más atributos: modelo, cilindrada, combustible, etc, etc)
 * el número de combinaciones a la hora de establecer filtros sería inabordable.
 *
 */
public class MostrarVehiculos {
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		
		lista.add(new Vehiculo("1111 AAA","FORD","ROJO",2000));
		lista.add(new Vehiculo("2222 BBB","SEAT","AZUL",2001));
		lista.add(new Vehiculo("3333 CCC","CITROEN","ROJO",2002));
		lista.add(new Vehiculo("4444 DDD","CITROEN","AZUL",2003));
		lista.add(new Vehiculo("5555 EEE","FIAT","ROJO",2004));
		lista.add(new Vehiculo("6666 FFF","KIA","AZUL",2005));
		
		System.out.println("\nVehiculos azules -------------");
		mostrarAzules(lista);
		System.out.println("\nVehiculos de determinado color -------------");
		mostrarColor(lista,"ROJO");
		System.out.println("\nVehiculos de determinado color y rango de años -------------");
		mostrarColor(lista,"ROJO", 2000, 2002);
	}
	
	//Mostrar los vehiculos azules
	public static void mostrarAzules(ArrayList<Vehiculo> lista){
		for(Vehiculo v: lista){
			if(v.getColor().equals("AZUL")){
				System.out.println(v);
			}
		}
	}
	
	//Mostrar los vehículos de determinado color 
	public static void mostrarColor(ArrayList<Vehiculo> lista, String color){
		for(Vehiculo v: lista){
			if(v.getColor().equals(color)){
				System.out.println(v);
			}
		}
	}
	
	//Mostrar los vehículos de determinado color 
	public static void mostrarColor(ArrayList<Vehiculo> lista, String color, int desdeAnyo, int hastaAnyo){
		for(Vehiculo v: lista){
			if(v.getColor().equals(color) && v.getAnyoMatricula() >= desdeAnyo && v.getAnyoMatricula() <= hastaAnyo){
				System.out.println(v);
			}
		}
	}

}
