package _02ejemplos._02polimorfismo;

import _02ejemplos._01alumnos.Alumno;
import _02ejemplos._01alumnos.Persona;

public class PolimorfismoNoForzado {
	public static void main(String[] args) {
		Persona p1 = new Persona("3478373K","Miguel");
		Persona p2 = new Persona("3478373K","Luisa");
		
		if(p1.equals(p2)){ //POLIMORFISMO
			System.out.println("Las dos personas son iguales");
		} else {
			System.out.println("Las dos personas son distintas. Se muestran ordenadas:");
			System.out.println("");
			if(p1.compareTo(p2)<0){ // NO POLIMORFISMO
				System.out.println(p1);
				System.out.println(p2);
			} else {
				System.out.println(p2);
				System.out.println(p1);
			}
		}
		
		Alumno a1 = new Alumno("4834987j","Raúl",13374);
		Alumno a2 = new Alumno("4834987S","Pepe",13375);
		if(a1.equals(a2)){ //POLIMORFISMO
			System.out.println("Las dos personas son iguales");
		} else {
			System.out.println("Las dos personas son distintas. Se muestran ordenadas:");
			System.out.println("");
			if(a1.compareTo(a2)<0){ // POLIMORFISMO
				System.out.println(a1);
				System.out.println(a2);
			} else {
				System.out.println(a2);
				System.out.println(a1);
			}
		}
		
	}

}
