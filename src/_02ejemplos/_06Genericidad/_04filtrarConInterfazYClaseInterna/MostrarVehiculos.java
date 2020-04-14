package _02ejemplos._06Genericidad._04filtrarConInterfazYClaseInterna;

import java.util.ArrayList;
/**
 * En esta clase mostramos los vehículos que cumplen determinada condición.
 * Para decidir qué objetos hay que imprimir y cuales no se untiliza 
 * una clase que implementa el interfaz Filtro, que se ha añadido al paquete
 * La clase que filtra los vehículos se ha creado en este mismo archivo. Son clases internas,
 * que solo se van a usar desde la clase en la que estamos. Por eso no tiene sentido crearlas
 * en archivos separados
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
		mostrar(lista, new FiltroAzules());
		System.out.println("\nVehiculos de rojos del 2000 -------------");
		mostrar(lista, new FiltroRojos2000());
	}
	
	//Mostrar vehiculos que cumplen un filtro
	public static void mostrar(ArrayList<Vehiculo> lista, Filtro filtro){
		for(Vehiculo v: lista){
			if(filtro.cumpleFiltro(v)){
				System.out.println(v);
			}
		}
	}
}
//Clase interna que implementa Filtro
class FiltroAzules implements Filtro{
	@Override
	public boolean cumpleFiltro(Vehiculo v) {
		if(v.getColor().equals("AZUL")) return true;
		else return false;
	}
	
}
//Clase interna que implementa Filtro
class FiltroRojos2000 implements Filtro{
	@Override
	public boolean cumpleFiltro(Vehiculo v) {
		if(v.getColor().equals("ROJO") && v.getAnyoMatricula() == 2000) return true;
		else return false;
	}
	
}