package _02ejemplos._06Genericidad._05filtrarConInterfazYClaseAnonima;

import java.util.ArrayList;
/**
 * En esta clase mostramos los veh�culos que cumplen determinada condici�n.
 * Para decidir qu� objetos hay que imprimir y cuales no se untiliza 
 * una clase que implementa el interfaz Filtro, que se ha a�adido al paquete
 *
 * La clase que filtra los veh�culos se crea "al vuelo". Son las llamadas "clases anonimas",
 * porque no tienen nombre. Solo se especif�ca el interfaz al que pertenece y su contenido
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
		
		System.out.println("\nVehiculos azules entre 2000 y 2002 -------------");
		mostrar(lista, new Filtro(){

			@Override
			public boolean cumpleFiltro(Vehiculo v) {
				if(v.getColor().equals("AZUL") && v.getAnyoMatricula() >= 2000 && v.getAnyoMatricula() <= 2002)
					return true;
			    else return false;
			}
			
		});
		
		System.out.println("\nVehiculos de rojos de marca FORD -------------");
		mostrar(lista, new Filtro(){
			@Override
			public boolean cumpleFiltro(Vehiculo v) {
				if(v.getColor().equals("AZUL") && v.getAnyoMatricula() >= 2000 && v.getAnyoMatricula() <= 2002)
					return true;
			    else return false;
			}
			
		});
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
