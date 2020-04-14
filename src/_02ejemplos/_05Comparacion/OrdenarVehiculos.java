package _02ejemplos._05Comparacion;

import java.util.Arrays;

public class OrdenarVehiculos {
	public static void main(String[] args) {
		Vehiculo[] vehiculos = {
			new Vehiculo("4773BBB","Ford"),
			new Vehiculo("1773BBB","Seat"),
			new Vehiculo("3787BCD","Ford"),
			new Vehiculo("9773CCC","Ford"),
			new Vehiculo("4773DDD","Seat"),
			new Vehiculo("7773BZT","Ford")
		};
		
		
		//Ordenar usando Arrays.sort
		//Arrays.sort(vehiculos);
		Ordenacion.ordenar(vehiculos);
		
		//Mostrar vehiculos ordenados
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i]);
		}
			
	}

}
