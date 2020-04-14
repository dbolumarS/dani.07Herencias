package _02ejemplos._06Genericidad._06filtrarConInterfazGenerica;

import java.util.ArrayList;
/**
 * En esta clase mostramos los vehículos que cumplen determinada condición.
 * Para decidir qué objetos hay que imprimir y cuales no se untiliza 
 * una clase que implementa el interfaz Filtro, que se ha añadido al paquete
 *
 * La clase que filtra los vehículos se crea "al vuelo". Son las llamadas "clases anonimas",
 * porque no tienen nombre. Solo se especifíca el interfaz al que pertenece y su contenido
 * 
 */
public class MostrarVehiculos {
	public static void main(String[] args) {
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		
		listaVehiculos.add(new Vehiculo("1111 AAA","FORD","ROJO",2000));
		listaVehiculos.add(new Vehiculo("2222 BBB","SEAT","AZUL",2001));
		listaVehiculos.add(new Vehiculo("3333 CCC","CITROEN","ROJO",2002));
		listaVehiculos.add(new Vehiculo("4444 DDD","CITROEN","AZUL",2003));
		listaVehiculos.add(new Vehiculo("5555 EEE","FIAT","ROJO",2004));
		listaVehiculos.add(new Vehiculo("6666 FFF","KIA","AZUL",2005));
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("Miguel"));
		listaPersonas.add(new Persona("Ana"));
		listaPersonas.add(new Persona("Rosa"));
		listaPersonas.add(new Persona("Pedro"));
		
		
		System.out.println("\nVehiculos azules entre 2000 y 2002 -------------");
		mostrarVehiculos(listaVehiculos, new Filtro<Vehiculo>(){

			@Override
			public boolean cumpleFiltro(Vehiculo v) {
				if(v.getColor().equals("AZUL") && v.getAnyoMatricula() >= 2000 && v.getAnyoMatricula() <= 2002)
					return true;
			    else return false;
			}
			
		});
		
		System.out.println("\nVehiculos de rojos de marca FORD -------------");
		mostrarVehiculos(listaVehiculos, new Filtro<Vehiculo>(){
			@Override
			public boolean cumpleFiltro(Vehiculo v) {
				if(v.getColor().equals("ROJO") && v.getMarca().equals("FORD"))
					return true;
			    else return false;
			}
			
		});
		
		System.out.println("\nPersonas que tienen una a en el nombre -------------");
		mostrarPersonas(listaPersonas, new Filtro<Persona>(){
			@Override
			public boolean cumpleFiltro(Persona p) {
				if(p.getNombre().toUpperCase().indexOf("A")!=-1) return true;
				else return false;
			}
			
		});
		
	}
	
	//Mostrar vehiculos que cumplen un filtro
	public static void mostrarVehiculos(ArrayList<Vehiculo> lista, Filtro<Vehiculo> filtro){
		for(Vehiculo v: lista){
			if(filtro.cumpleFiltro(v)){
				System.out.println(v);
			}
		}
	}
	
	//Mostrar personas que cumplen un filtro
	public static void mostrarPersonas(ArrayList<Persona> lista, Filtro<Persona> filtro){
		for(Persona v: lista){
			if(filtro.cumpleFiltro(v)){
				System.out.println(v);
			}
		}
	}
}
